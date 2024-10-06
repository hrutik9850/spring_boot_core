package com.nt;
import com.nt.sbeans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

public class BootProj02DependencyInjectionApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctf = SpringApplication.run(BootProj02DependencyInjectionApplication.class, args);
	
		Vehicle vehicle = ctf.getBean("vehicle",Vehicle.class);
	String junery = vehicle.jounery("akola ", "Goa");
	System.out.println(junery);
	((ConfigurableApplicationContext)ctf).close();
	}

}
