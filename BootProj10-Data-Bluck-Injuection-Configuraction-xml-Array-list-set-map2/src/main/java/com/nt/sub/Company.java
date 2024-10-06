package com.nt.sub;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("com")
@Data()
public class Company {
	public String name;
	public String age ;
	public int size;
	

}
