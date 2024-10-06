package com.nt.advise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristNotFoundExcepation extends Throwable{
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String>  handelerIlleger(IllegalArgumentException iga){
	return new ResponseEntity<String>(iga.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
@ExceptionHandler(Exception.class)
public ResponseEntity<String> handleAllExcepation(Exception e){
	return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	
}
}
