package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sub.Employe;

@SpringBootApplication
public class BootProj08DataBluckInjuectionConfiguractionArrayListSetMapApplication {

	public static void main(String[] args) {
	ApplicationContext	ctx = SpringApplication.run(BootProj08DataBluckInjuectionConfiguractionArrayListSetMapApplication.class, args);
	Employe  emp = ctx.getBean("emp",Employe.class);
	
	System.out.println(emp);
	((ConfigurableApplicationContext) ctx).close();
	}

}
