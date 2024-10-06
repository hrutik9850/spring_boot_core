package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.configer.EmployeeOperationsController;
import com.nt.mode.Employee;

@SpringBootApplication
public class BootProj03MinayProjectApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(BootProj03MinayProjectApplication.class, args);
	
	EmployeeOperationsController empcon = ctx.getBean("empController",EmployeeOperationsController.class );
	try {
		List<Employee> list = empcon.getEmployeesByDesgs("CLERK", "MANAGER", "SALESMAN");
		list.forEach(emp->{
			System.out.println(emp);
		});
		
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	  ((ConfigurableApplicationContext) ctx).close();
	}

}
