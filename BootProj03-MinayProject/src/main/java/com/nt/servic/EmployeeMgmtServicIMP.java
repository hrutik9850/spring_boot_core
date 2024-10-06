package com.nt.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServicIMP implements IEmployeeMgmtService {
    @Autowired
    private IEmployeeDAO empDAO;

    @Override
    public List<Employee> fetchAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
        List<Employee> list = empDAO.showAllEmployeesByDesgs(desg1, desg2, desg3);
        list.forEach(emp -> {
            emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.4f));
            emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2f));
        });
        return list;
    }
}

