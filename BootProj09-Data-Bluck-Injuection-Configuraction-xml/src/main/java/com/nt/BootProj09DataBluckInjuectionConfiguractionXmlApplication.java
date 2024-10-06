package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sub.Employ;

@SpringBootApplication
public class BootProj09DataBluckInjuectionConfiguractionXmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj09DataBluckInjuectionConfiguractionXmlApplication.class, args);
	
	Employ emp = ctx.getBean("emp",Employ.class);
	System.out.println(emp);
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
