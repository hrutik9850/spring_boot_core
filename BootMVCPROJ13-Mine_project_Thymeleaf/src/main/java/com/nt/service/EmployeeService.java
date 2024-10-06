package com.nt.service;

import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.nt.modle.EmployeeModle;
import com.nt.repo.IEmployeeRepo;
import com.nt.repo.IEmployee_page_Repo;
@Service("employee")
public class EmployeeService implements IEmployeeService {
	@Autowired
	public IEmployeeRepo employeerpo ;
	@Autowired
	public IEmployee_page_Repo pagrepo;

	@Override
	public Iterable<EmployeeModle> getAllEmployee() {
	
		return employeerpo.findAll();
	}
	@Override
	public String addEmployee(EmployeeModle emp) {
		
		return "Add thise employe in List"+employeerpo.save(emp).getEmpno();
	}
	@Override
	public EmployeeModle getEmployee(Integer Id) {
		EmployeeModle emp = employeerpo.findById(Id).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}
	@Override
	public String updateEmployee(EmployeeModle emp) {
		
		return "Update Succese full "+employeerpo.save(emp).getEmpno();
	}
	@Override
	public String deleteEmployee(Integer Id) {
		employeerpo.deleteById(Id);
		return "thise id recored will be delete "+Id ;
	}
	@Override
	public Page<EmployeeModle> showPageEmployee(Pageable pageable) {
		
		return pagrepo.findAll(pageable);
	}

	
	
}
