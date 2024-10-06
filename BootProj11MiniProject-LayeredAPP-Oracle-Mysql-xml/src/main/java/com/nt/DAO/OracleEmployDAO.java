package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.moble.Employee;
@Repository("Employdao")
public class OracleEmployDAO implements EmployDAO{
	private static final String QUERY_EMP= "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	public DataSource ds;
	@Override
	public List<Employee> showAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws SQLException {
		
		List<Employee> list = null;
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(QUERY_EMP);){
			try(ResultSet rst = ps.executeQuery()){
				Employee emp = new Employee();
				while(rst.next()) {
					 emp.setEmpno(rst.getInt(1));
					 emp.setEname(rst.getString(2));
					 emp.setJob(rst.getString(3));
					 emp.setSal(rst.getFloat(4));
					 emp.setDeptno(rst.getInt(5));
					list.add(emp);
				}
			}catch(SQLException es) {
				es.printStackTrace();
				throw es;
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
