package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.ITouristMgmService;

@RestController
@RequestMapping("/tourist")
public class TouristOperationController {
	
	@Autowired
	private ITouristMgmService  service ;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tuorist){
	try {
		String resultmsg = service.registerTourist(tuorist);
		return new ResponseEntity<String>(resultmsg,HttpStatus.CREATED);
		}
	catch(Exception e) {
		return new ResponseEntity<String>("proble in tourist enrollmer",HttpStatus.INTERNAL_SERVER_ERROR);

	}
	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Tourist>> displyTourist(){
	//	List<Tourist>list = service.fetchAllTourists();
		List<Tourist>list = service.showAllTourist();
		return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	}
}
