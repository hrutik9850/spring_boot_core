package com.nt.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankoperationController {

	@GetMapping("/welcome")
	public ResponseEntity<String> showHome(){
		return new ResponseEntity<String>("Welcome to homw page :: " ,HttpStatus.OK);
				
	}
	@GetMapping("/offers")
	public ResponseEntity<String> showoffers(){
		return new ResponseEntity<String>("offers page",HttpStatus.OK);
	}

	/*	@GetMapping("/lon-approve")
	//	@PreAuthorize("hasAuthority('MANAGER')")
		public ResponseEntity<String> approveLoan(){
			int amount = new Random().nextInt(12000);
			return new ResponseEntity<String>("Loan app roved the amount is  ::"+amount,HttpStatus.OK);
		}*/
	@GetMapping("/loan")
	@PreAuthorize("hasAuthority('MANAGER')")
	public ResponseEntity<String> approveLoan(){
		int amount = new Random().nextInt(12000);
		System.out.println("BankoperationController.approveLoan()");
		return new ResponseEntity<String>("Loan Approved,the amount is::"+amount,HttpStatus.OK);
	}
	
	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')")
	public ResponseEntity<String> showBalance(){
		int  amount = new  Random().nextInt(20000000);
		System.out.println("BankoperationController.showBalance()");
		return new ResponseEntity <String> ("Balance is ::"+amount,HttpStatus.OK);
	}
}
