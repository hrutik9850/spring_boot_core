package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.nt.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingController {
	@Autowired
	private IBillingServiceRestConsumer consumer;
	
	@GetMapping("/details")
	public String displayShoppingDetails() {
	System.out.println("ShoppingController.displayShoppingDetails()");
	return "Pongal Shopping for family .."+consumer.fetchBillDetails();
	}
}
