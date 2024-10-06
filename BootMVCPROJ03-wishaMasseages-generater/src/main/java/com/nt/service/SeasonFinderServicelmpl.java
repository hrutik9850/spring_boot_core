package com.nt.service;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.stereotype.Service;
@Service("servicfinder")
public class SeasonFinderServicelmpl implements ISeasonFinderService {
	public String finderSeason() {
		//get system date 
		LocalDate det =  LocalDate.now();
		//get current month 
		int  monthid = det.getMonthValue();
		if(monthid >=7&& monthid<=9) {
			return "Rainy Season";
		}
		else if(monthid >=3&& monthid<=6) {
			return "summer Season";
		}
		
		else
		return "Winter season";
	}

}
