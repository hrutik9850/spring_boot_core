package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/controller2")
@Controller
public class DataRenderingController2 {
	
	@RequestMapping("/welcome")
	public String showWshiCont2() {
		System.out.println("DataRenderingController2.showWshiCont2()");
		return "welcome";
	}

	
	@GetMapping("page1")
	public String showpage1() {
	System.out.println("DataRenderingController.showpage1()");
	return "page1";
}	
}
