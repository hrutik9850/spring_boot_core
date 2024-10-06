package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.service.IEmployInformationService;
@Component
public class EmployInformationRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployInformationService empinfoservice;
	
	@Override
	public void run(String... args) throws Exception {
		
	 empinfoservice.showsalaryrangemploy(3000.0 , 5000.0).forEach(System.out::println);	
	 empinfoservice.showdeptIdsalrangemploy(10,2000.0 , 5000.0).forEach(System.out::println);	
	 
	}
}
