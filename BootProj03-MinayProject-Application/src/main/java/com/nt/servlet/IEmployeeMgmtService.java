package com.nt.servlet;

import java.util.List;

import com.nt.mode.Employee;

public interface IEmployeeMgmtService {
	 public List<Employee> serchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception;
}
