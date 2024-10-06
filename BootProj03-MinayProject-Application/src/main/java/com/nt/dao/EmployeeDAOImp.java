package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.mode.Employee;
@Repository("empDAO")
public class EmployeeDAOImp implements IEmployeeDAO {
	private static final String GET_EMP_QUERY ="SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN (?, ?, ?) ORDER BY JOB";
	@Autowired
	private DataSource ds;
	@Override
	public List<Employee> showAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImp.showAllEmployeesByDesgs()"+ ds.getClass());
		List<Employee> list = null;
		try (Connection com = ds.getConnection();
			PreparedStatement ps = com.prepareStatement(GET_EMP_QUERY)
				){
				ps.setString(1, desg1);
				ps.setString(2, desg2);
				ps.setString(3, desg3);
				
				try (ResultSet rs = ps.executeQuery()){
					list = new ArrayList();
					while(rs.next()) {
						Employee emp =  new Employee();
						emp.setEno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setSalary(rs.getDouble(4));
						emp.setDeptno(rs.getInt(5));
						list.add(emp);
						return list;
					}
				} 
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} 
		
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	return list;
	}
}
