package com.nt.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nt.moble.Employee;

public interface EmployDAO {
	public List<Employee> showAllEmployeesByDesgs(String desg1 ,String desg2,String desg3)throws SQLException;

}
