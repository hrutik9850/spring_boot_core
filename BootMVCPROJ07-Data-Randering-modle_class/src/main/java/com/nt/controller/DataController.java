package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.modle.Employee;

@Controller
public class DataController {
	@GetMapping("/show")
	public String showData(Map<String,Object> map) {
		System.out.println("DataController.showData()");
		Employee emp1 = new Employee(1001,"hrutik",5000.0);
		Employee emp2 = new Employee(1002,"omkar",4000.0);
		Employee emp3 = new Employee(1003,"karam",6000.0);
		
		map.put("empinfo", List.of(emp1,emp2,emp3));
		return "show_user";
		
	}

}
