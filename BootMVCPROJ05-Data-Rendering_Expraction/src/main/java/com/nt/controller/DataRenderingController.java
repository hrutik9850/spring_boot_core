package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class DataRenderingController {
	
	
	/*	@RequestMapping("/welcome")
			public String showWishCont1() {
				System.out.println("DataRenderingController.showWishCont1()");
				return "welcome";
			}*/
	
	
	
			@RequestMapping("/")
			public String showpage1() {
			System.out.println("DataRenderingController.showpage1()");
			return "page1";
		}	/*
			//@RequestMapping(value="/report",method=RequestMethod.GET)
			@GetMapping("/report")
			public String showReport() throws Exception {
				System.out.println("DataRenderingController.showReport()");
				return "showuser";
			}
			//@RequestMapping(value="/report",method=RequestMethod.GET)
			@PostMapping("/report")
			public String showReport1() throws Exception {
				System.out.println("DataRenderingController.showReport1()");
				return "welcome";
			}*/

	
	
	
		/*//	@RequestMapping(value="/showuser",method=RequestMethod.POST)
			@PostMapping("/showuser")
			public String showUser() throws Exception {
				System.out.println("DataRenderingController.showUser()");
				return "showuser";
			}
			
			
			
		*/
		/*@RequestMapping("/REPORT")
		public String showReport2() {
			System.out.println("DataRenderingController.showReport()");
			return "report";
		}*/
		@RequestMapping("/welcome")
		public String showWelcome() {
			System.out.println("DataRenderingController.showWelcome()");
			return "welcome";
		}
	
	
	
	
		/*	@RequestMapping("/getfrom")
			public String showgetform() {
				System.out.println("DataRenderingController.showgetform()");
				return "getfrom";
			}
			@RequestMapping("/postfrom")
			public String showPostFrom() {
				System.out.println("DataRenderingController.showPostFrom()");
				return "postfrom";
			}*/
		
	
	
		@GetMapping("showuser")
		public String showforword() {
			System.out.println("DataRenderingController.showforword()");
			return "forward:welcome";
		}

	
		@GetMapping("nextcontroller")
		public String showforwordController2() {
			System.out.println("DataRenderingController.showforwordController2()");
			return "forward:controller2/page1";
		}
		
		
	
}
