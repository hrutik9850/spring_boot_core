package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.DAO.EmployDAO;
import com.nt.moble.Employee;

public class EmployeeService implements IEmployeeService {
	
	EmployDAO empdao ;
	@Override
	public List<Employee> searchaEmployeeBydeseg(String desg1, String desg2, String desg3) throws Exception {
		
		
		List<Employee> list = empdao.showAllEmployeesByDesgs(desg1,desg2,desg3);
		return list;
	}

}
