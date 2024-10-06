package com.nt.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wishmassage")
public class WishMassageService implements IWshiMassageService {
	

	@Override
	public String showWishamass() {
		LocalDateTime  ldt = LocalDateTime.now();
		int time = ldt.getHour();
		if(time >4 &&time <12)
			return "Good morning";
		else if(time > 12 && time < 17)
			return "Good Evening";
		else
		return "good night";
	}
	
	
	
	

}
