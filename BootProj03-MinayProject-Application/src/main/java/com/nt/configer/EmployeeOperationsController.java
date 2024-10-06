package com.nt.configer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;

import com.nt.mode.Employee;
import com.nt.servlet.IEmployeeMgmtService;

@Controller("empController")
public class EmployeeOperationsController {
	@Autowired
	private  IEmployeeMgmtService empService;
	
	public    List<Employee>   getEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
		//use service
		List<Employee> list=empService.serchEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
