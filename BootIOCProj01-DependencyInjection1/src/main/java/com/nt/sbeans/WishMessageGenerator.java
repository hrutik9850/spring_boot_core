package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	
	public  String  showWishMessage(String name) {
		//get currrent hour the day
		int hour=ldt.getHour();
		if(hour<12)
			return "GoodMorning::"+name;
		else if(hour<16)
			return "Good AfterNoon:"+name;
		else if(hour<20)
			return "Good Evening:"+name;
		else 
			return "Good Night :"+name;
			
	}

}
