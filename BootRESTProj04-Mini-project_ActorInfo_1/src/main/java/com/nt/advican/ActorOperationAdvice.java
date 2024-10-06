package com.nt.advican;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorOperationAdvice {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllExcepation(Exception e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> actorid(IllegalArgumentException e ){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
