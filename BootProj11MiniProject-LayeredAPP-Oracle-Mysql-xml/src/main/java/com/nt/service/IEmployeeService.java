package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.moble.Employee;

public interface IEmployeeService {
	public List<Employee> searchaEmployeeBydeseg(String desg1,String desg2,String desg3)throws SQLException, Exception ;
}
