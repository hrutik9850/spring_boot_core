package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.MessageStore;
import com.nt.producer.Messageproducer;

@RestController
public class KafkaMessageHandllingcontroller {
	@Autowired
	private Messageproducer producer;
	@Autowired
	private MessageStore store;
	
	
	@GetMapping("/send")
	public String sendMessage(@RequestParam("message")String message) {
		String status = producer.sendMessage(message);
		return "<h1>"+status+"</h1>";
		
	}
	@GetMapping("/redAll")
	public String fetchAllMessage() {
		return "<h1>"+store.getAllMessage()+"</h1>";
	}
	

}
