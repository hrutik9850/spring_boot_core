package com.nt.sub;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data()
@ConfigurationProperties(prefix = "org.nit")
public class Employ {
	
	private String name;
	private int age;
	private int size ;
	

}
