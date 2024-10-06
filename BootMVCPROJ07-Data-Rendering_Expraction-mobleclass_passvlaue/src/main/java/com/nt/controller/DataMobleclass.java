package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.moble.Employee;

@Controller
public class DataMobleclass {

@GetMapping("/report")
public String sendData(Map<String,Object> map){
	System.out.println("DataMobleclass.sendData()");
				Employee emp1 = new Employee();
				emp1.setId(1001);emp1.setEname("rama");emp1.setSalary(5000.0);
				map.put("empinfo",emp1);
			return"show_report";
			
		}


}
