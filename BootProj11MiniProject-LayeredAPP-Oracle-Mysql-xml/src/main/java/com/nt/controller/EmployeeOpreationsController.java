package com.nt.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.service.IEmployeeService;

public class EmployeeOpreationsController {
	@Autowired
	public IEmployeeService empcontroller ;
	
	public List<Employee> getemployeedegs(String desg1,String desg2,String desg3)throws IOException,SQLException ,Exception

}

