package com.nt.configuraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.ActorData;
import com.nt.service.IActorInfoService;

@RestController()
@RequestMapping("/actor")
public class ActorInfoController {
@Autowired
public IActorInfoService service;
@PostMapping("/register")
public ResponseEntity<String> saveActor(@RequestBody ActorData data){
	//user service
	try {
	String msg = service.registerActor(data) ;
	return new ResponseEntity<String>(msg,HttpStatus.OK);
	
}

	catch(Exception e) {
	return new ResponseEntity<String>("proble is the Actor data ",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
