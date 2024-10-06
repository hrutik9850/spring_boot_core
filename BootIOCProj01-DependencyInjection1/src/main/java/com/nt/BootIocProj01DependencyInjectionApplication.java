package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj01DependencyInjectionApplication {
	
	
	@Bean(name="ldt")
	public  LocalDateTime createLDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		  //  get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj01DependencyInjectionApplication.class, args);
		  //get target spring bean class obj ref
		 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 //invoke the b.method
		 String msg=generator.showWishMessage("raja");
		 System.out.println("result::"+msg);
		 
		 //close the container
		  ((ConfigurableApplicationContext) ctx).close();
	}

}
