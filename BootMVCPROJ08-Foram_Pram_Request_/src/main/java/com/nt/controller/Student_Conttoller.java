package com.nt.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.modle.Student;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Student_Conttoller {
	@Autowired
	public Student servlet;
	@GetMapping("/")
	public String showWelcome() {
		System.out.println("Student_Conttoller.showWelcome()");
		// home.jsp ------------welcome 
		return "home";
	}
	
	@GetMapping("/register")
	public String showData() {
		
		System.out.println("Student_Conttoller.showData()");
		return"register";
	}
	@PostMapping("/register")
	public String register(Map<String,Object>map,
					@ModelAttribute("stud") Student st) {
						//-----for data binding  to  place form data into modle class obj
		System.out.println("Student_Conttoller.register()");
		String gread =null;
		if(st.getAvg()>=75)
			gread = "fast class pass student";
		else if(st.getAvg()>=60)
			gread ="secand class pass student";
		else if (st.getAvg()>=40)
			gread = "thard class passstudent ";
		else 
			gread ="fail student ";
		
	//	map.put("student", st);
		map.put("result",gread);
		System.out.println(st);
		
	return "show_result";
		
	}
	/*@GetMapping("/data")
	public String showReqestPram(@RequestParam("son")int no,@RequestParam("sname")String name) {
		
		System.out.println("Student:"+no+"student name " +name);
		
		return "show_parma";
		
	}*/
	
	
	/*@GetMapping("/data")
	public String showReqestPram(@RequestParam int sno,@RequestParam String sname) {
		
		System.out.println("Student:"+sno+"student name " +sname);
		
		return "show_parma";
		
	}*/
	
	/*
		@GetMapping("/data")
		public String showReqestPram(@RequestParam int sno,@RequestParam(required = false) String sname) {
			
			System.out.println("Student:"+sno+"student name " +sname);
			
			return "show_result";
			
		}*/
	
//	http://localhost:8081/BootMVCPROJ08-Foram_Pram_Request_/data?sno=101&sname=hrutik&addrs=akola&addrs=buldhana&addrs=shegowa&sub=Englisha&sub=matcha&mno=0988743&mno08484784
	/*@GetMapping("/data")
	public String showReqestPram(@RequestParam int sno,
								@RequestParam String sname,
								@RequestParam String addrs[],
								@RequestParam List<String>sub,
								@RequestParam Set<Integer>mno
									) {
		System.out.println("Student_Conttoller.showReqestPram()");
		System.out.println("Student:"+sno+"student name " +sname +"Addres"+ Arrays.toString(addrs)+"subject::"+sub+"Moble Number::"+mno);
		
		
		return "show_result";
		
	}
	*/
	
	
	//http://localhost:8081/BootMVCPROJ08-Foram_Pram_Request_/data?sno=101&sname=hrutik&sname=Anikeat
	/*@GetMapping("/data")
	public String showReqestPram(@RequestParam int sno,@RequestParam(required = false) String sname) {
		
		System.out.println("Student:"+sno+"student name " +sname);
		
		return "show_result";
		
	}*/
	
	@Autowired
	public ServletContext sc;
	@Autowired
	public ServletConfig cg;
	@GetMapping("/data")
	public String showDataServerlet(HttpSession ses,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("web app name::" +sc.getContextPath());
		System.out.println("Ds logicla name::"+cg.getServletName());
		System.out.println("session id ::"+ ses.getId());
		System.out.println("response content type::"+res.getContentType());

		return "home";
		
	}
	

}
