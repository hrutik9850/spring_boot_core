package com.nt.service;

import com.nt.modle.EmployeeModle;

public interface IEmployeeService {
	public Iterable<EmployeeModle> getAllEmployee();
	public String addEmployee(EmployeeModle emp);
	public EmployeeModle getEmployee(Integer Id);
	public String updateEmployee(EmployeeModle emp);
	public String deleteEmployee(Integer Id);
}
