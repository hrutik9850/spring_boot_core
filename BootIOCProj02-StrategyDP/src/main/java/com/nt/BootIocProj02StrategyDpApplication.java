package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Flipkart;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj02StrategyDpApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj02StrategyDpApplication.class, args);
	   // get target spring bean class obj ref
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		String resultMsg=fpkt.purchase(new String[] {"shirt","trouser","hat"},
				                                                      new double[] {7000.0,8000.0,9000.0});
		System.out.println(resultMsg);
		
		//close the container
		  ((ConfigurableApplicationContext) ctx).close();
	
	}

}
