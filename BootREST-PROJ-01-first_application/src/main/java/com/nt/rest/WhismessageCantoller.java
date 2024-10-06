package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/whis-api")
public class WhismessageCantoller {
	@GetMapping("/whis")
	public ResponseEntity<String> whisMessage(){
		System.out.println("WhismessageCantoller.whisMessage()");
		return new ResponseEntity<String>("welcome",HttpStatus.OK);
	}
	

}
