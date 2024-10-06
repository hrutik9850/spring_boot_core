package com.nt.cantoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BankOpracationCantoller {
	
	@GetMapping("/")
	public String showhome() {
		return"home";
	}
	@GetMapping("/balance")
	public String checkBalnce() {
		System.out.println("BankOpracationCantoller.checkBalnce()");
		return "show_balance";
	}
	
	@GetMapping("/loanApprove")
	public String approvLan() {
		System.out.println("BankOpracationCantoller.approvLan()");
		return "loan";
		
	}
	@GetMapping("/offers")
	public String showOffer() {
		System.out.println("BankOpracationCantoller.showOffer()");
		return"offers";
	}
	@GetMapping("/denied")
	public String accessDenied() {
		return "access_denied";
	}
	
	
	

}
