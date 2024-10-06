package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationCantroller {
	
	@GetMapping("/show")
	public ResponseEntity<String> showCustomer(){
		System.out.println("CustomerOperationCantroller.showCustomer()");
		return new ResponseEntity<String>("Customer data selected ",HttpStatus.CONFLICT);
	}
	@PostMapping("/reguster")
	public ResponseEntity<String> saveCustomer(){
		System.out.println("CustomerOperationCantroller.saveCustomer()");
		return new ResponseEntity<String>("save all Customer data",HttpStatus.OK);
	}
	@PutMapping("/modifay")
	public ResponseEntity<String> updateCustomer(){
		System.out.println("CustomerOperationCantroller.updateCustomer()");
		return new ResponseEntity<String>("update all customer detal ",HttpStatus.OK);
	}
	@PatchMapping("/pmodifay")
	public ResponseEntity<String> updateIdCustomer(){
		System.out.println("CustomerOperationCantroller.updateIdCustomer()");
		return new ResponseEntity<String>("update depend of Id Contantent ",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteIdCustomer(){
		System.out.println("CustomerOperationCantroller.deleteIdCustomer()");
		return new ResponseEntity<String>("delete customer deteal ",HttpStatus.OK);
	}

}
