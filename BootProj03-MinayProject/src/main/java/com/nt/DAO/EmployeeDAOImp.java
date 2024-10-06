package com.nt.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImp implements IEmployeeDAO {
    private static final String GET_EMPS_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN (?, ?, ?) ORDER BY JOB";

    @Autowired
    private DataSource ds;

    @Override
    public List<Employee> showAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
    	System.out.println("EmployeeDAOImpl.showAllEmployeesByDesgs() ds obj class name:"+ds.getClass());
		List<Employee> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);
				){
     		ps.setString(1, desg1);
     		ps.setString(2, desg2);
     		ps.setString(3, desg3);
     		try(ResultSet rs = ps.executeQuery();){
     			list = new ArrayList();
     			Employee emp = new Employee();
     			while(rs.next()) {
     				emp.setEno(rs.getInt(1));
     				emp.setEname(rs.getString(2));
     				emp.setJob(rs.getString(3));
     				emp.setSalary(rs.getDouble(4));
     				emp.setDeptno(rs.getInt(5));
     				
     				list.add(emp);
     			}
     		}catch(SQLException se) {
     			se.printStackTrace();
     			throw se;
     
     		}catch(Exception e) {
     			e.printStackTrace();
     			throw e;
     		}
     		
     	}
        return list;
    }
}

