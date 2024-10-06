package com.nt.conrtoller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedBusUserOperationsController {
	
	@GetMapping("/home")
	public String showhome() {
		return "Hello WELCOME TO HOME PAGE of REdBus.com";
	}

	@GetMapping("/after")
	public String afterLogine() {
		return "HELLO SUCCESSFULLY LOGGED INTO RedBus.com";
	}
	
	@GetMapping("/user")
	public Authentication showUserDetails(Principal principal) {
		System.out.println("logged in details ::"+principal.getName());
		System.out.println("RedBusUserOperationsController.showUserDetails()");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}
}
