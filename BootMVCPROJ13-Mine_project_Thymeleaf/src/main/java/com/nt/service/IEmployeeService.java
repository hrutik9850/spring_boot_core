package com.nt.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.nt.modle.EmployeeModle;

public interface IEmployeeService {
	public Iterable<EmployeeModle> getAllEmployee();
	public Page<EmployeeModle>showPageEmployee(Pageable pageable);
	public String addEmployee(EmployeeModle emp);
	public EmployeeModle getEmployee(Integer Id);
	public String updateEmployee(EmployeeModle emp);
	public String deleteEmployee(Integer Id);
}
