package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public  class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeDAO  empDAO;

	@Override
	public List<Employee> searchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		//use DAO
		List<Employee> list=empDAO.showAllEmployeesByDesgs(desg1, desg2, desg3);
		
		// calculate  gross Salary and netsalary (b.logic)
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSal()+(emp.getSal()*0.4f));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*.2f));
		});
		
			return list;
	}

}
