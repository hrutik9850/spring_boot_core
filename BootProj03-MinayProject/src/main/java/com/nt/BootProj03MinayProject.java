package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03MinayProject {

	public static void main(String[] args) {
	ApplicationContext	ctx = SpringApplication.run(BootProj03MinayProject.class, args);
		  EmployeeOperationsController controller = ctx.getBean("empControl", EmployeeOperationsController.class);

	        try {
	            List<Employee> list = controller.getEmployeesByDesgs("CLERK","SALESMAN", "MANAGER");
	            list.forEach(emp -> {
	                System.out.println(emp);
	            });
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        ((ConfigurableApplicationContext) ctx).close();
	    }
	




	
	}


