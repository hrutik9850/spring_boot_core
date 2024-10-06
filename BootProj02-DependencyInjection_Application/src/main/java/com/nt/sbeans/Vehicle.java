package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("vehicle")
public  class Vehicle{
	@Autowired	
	@Qualifier("DEng")
	public IEngine engine;
	public String jounery(String from, String  to) {
		String jfrom = from;
		String jto = to;
		engine.start();
		System.out.println("jounery started "+jfrom);
		engine.stop();
		System.out.println("jounery stoped :"+jto);
		
		return "start to stop : " +jfrom +","+jto;
				
	}
	

}
