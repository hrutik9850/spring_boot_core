package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWshiMassageService;

@Controller
public class WishaMassController {
	@Autowired
	private IWshiMassageService servic ;

	
	@RequestMapping("/")
	public String showhome() {
		return "welcome";
	}
	@RequestMapping("/desplay")
	public String showMass(Map<Object,String> map) {
		String mass = servic.showWishamass();
		map.put("resultMsg", mass);
		return"season";
	}
	
	
}
