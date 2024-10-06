package com.nt.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.modle.Student;
import com.nt.service.IStudentService;
import com.nt.service.StudentSerive;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Student_Conttoller {
	@Autowired
	public IStudentService stuServic ;
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
	@GetMapping("/get_Student_ID")
	public String showStudent_Id(Map<String, Object>map) {
		Student msg = stuServic.getStrudentDetaL(101);
		return "/";
	}
	
	
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
