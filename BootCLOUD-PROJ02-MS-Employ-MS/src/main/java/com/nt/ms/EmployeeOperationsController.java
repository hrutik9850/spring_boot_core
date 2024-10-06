package com.nt.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
public class EmployeeOperationsController {
	
	@GetMapping("/report")
	public ResponseEntity<String> showEmployeeReport(){
		return new ResponseEntity<String>("Employees report",HttpStatus.OK);
	}

}
