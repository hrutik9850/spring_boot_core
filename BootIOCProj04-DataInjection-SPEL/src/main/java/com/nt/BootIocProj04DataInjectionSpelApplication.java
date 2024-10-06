package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.TraininigInistitute;

@SpringBootApplication
public class BootIocProj04DataInjectionSpelApplication {

	public static void main(String[] args) {
		  //get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj04DataInjectionSpelApplication.class, args);
		//get Spring bena class obj ref
		TraininigInistitute  inst=ctx.getBean("inst",TraininigInistitute.class);
		System.out.println("date::"+inst);
		System.out.println("===================================");
		
		Environment env=ctx.getEnvironment();
		System.out.println("os.name ::"+env.getProperty("os.name"));
		System.out.println("java fee::"+env.getProperty("java.fee"));
		//clsoe container
		((ConfigurableApplicationContext) ctx).close();
	}

}
