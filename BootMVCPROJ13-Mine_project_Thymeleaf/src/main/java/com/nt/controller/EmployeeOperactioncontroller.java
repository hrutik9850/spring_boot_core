package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.modle.EmployeeModle;
import com.nt.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employee")
public class EmployeeOperactioncontroller {
	@Autowired
	private IEmployeeService employservice;
	
	@GetMapping("/")			//---------> home page 
	public String showHome() {
		
		return "home";
	}
	
	
	@GetMapping("/page_report")
	public String showPageEmployeeReport(@PageableDefault(page = 0,size =3,sort ="deptname",direction =Sort.Direction.ASC)Pageable pageable,
												Map<String ,Object>map) {
		
		Page<EmployeeModle> page = employservice.showPageEmployee(pageable);
		map.put("empreport", page);
		System.out.println("EmployeeOperactioncontroller.showAllEmployeeReport()");
		return"showpage_report";
	}
	
	@GetMapping("/report")
	public String showAllEmployeeReport(Map<String ,Object>map) {
		
		Iterable<EmployeeModle> emp = employservice.getAllEmployee();
		map.put("empreport", emp);
		System.out.println("EmployeeOperactioncontroller.showAllEmployeeReport()");
		return"show_report";
	}
	@GetMapping("/emp_add")// for form launching
	public String showFromForsaveEmployee(@ModelAttribute("emp")EmployeeModle emp) {
		System.out.println("EmployeeOperactioncontroller.showFromForsaveEmployee()");
		
		//return LVN
		return "register_employee";
	}
	
	/*	@PostMapping("/emp_add") 		//  there is refresh request to the browser to multiple time exceute
		public String addingregisterEmployee(Map<String,Object>map ,
												@ModelAttribute("emp")EmployeeModle registeremp) {
			System.out.println("EmployeeOperactioncontroller.addingregisterEmployee()");
			String mass = employservice.addEmployee(registeremp);
			Iterable <EmployeeModle> emp = employservice.getAllEmployee();
			map.put("registe",mass);
			map.put("empreport", emp);
			return "redirect:show_report";
			
		}*/
	
	/*
	@PostMapping("/emp_add")				// masses will not comming 
	public String addingregisterEmployee(Map<String,Object>map ,
											@ModelAttribute("emp")EmployeeModle registeremp) {
		System.out.println("EmployeeOperactioncontroller.addingregisterEmployee()");
		String mass = employservice.addEmployee(registeremp);
	
		map.put("registe",mass);
	
		return "redirect:report";
		
	}*/
	
	

	/*@PostMapping("/emp_add")
	public String addingregisterEmployee(RedirectAttributes attrs,
											@ModelAttribute("emp")EmployeeModle registeremp) {
		System.out.println("EmployeeOperactioncontroller.addingregisterEmployee()");
		String mass = employservice.addEmployee(registeremp);
	
		attrs.addFlashAttribute("registe",mass);
	
		return "redirect:report";
		
	}*/
	
	
	@PostMapping("/emp_add")				
	public String addingregisterEmployee(@ModelAttribute("emp")EmployeeModle registeremp,HttpSession scs) {
		System.out.println("EmployeeOperactioncontroller.addingregisterEmployee()");
		String mass = employservice.addEmployee(registeremp);
	
		scs.setAttribute("registe",mass);
	
		return "redirect:report";
		
	}
	
	@GetMapping("/emp_edit")
	public String showeditEmployee(@RequestParam("no")int no,@ModelAttribute("emp")EmployeeModle emp) {
		
		EmployeeModle emp1 = employservice .getEmployee(no);
		BeanUtils.copyProperties(emp1, emp);
		System.out.println("EmployeeOperactioncontroller.showeditEmployee()");
		
		return"update_employee";
	}
	
	
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp")EmployeeModle emp) {
		System.out.println("EmployeeOperactioncontroller.editEmployee()");
		String mass = employservice.updateEmployee(emp);
		attrs.addFlashAttribute("registe", mass);
		
		return"redirect:report";
	}
	
	

	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs,@RequestParam("no")int no) {
		String mass = employservice.deleteEmployee(no);
	
		attrs.addFlashAttribute("registe", mass);
		
		return"redirect:report";
	}

}
