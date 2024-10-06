package com.nt.runere;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.nt.entity.CallTruenInfo;
import com.nt.service.ICallerTuneMgmtService;

@Controller
public class VersionIngAndTimeStampingTest implements CommandLineRunner {

	@Autowired
	private ICallerTuneMgmtService icallertunemgmtservice;
	@Override
	public void run(String... args) throws Exception {
		/*	try {
				
				CallTruenInfo info = new CallTruenInfo("hrutik","dilvale ");
				System.out.println(icallertunemgmtservice.saveCallerTuneInfo(info));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("===============================================");
			
			
			try {
				
				CallTruenInfo info = new CallTruenInfo("kartik","aaydil hay muskil ");
				System.out.println(icallertunemgmtservice.saveCallerTuneInfo(info));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("===============================================");
		*/
		
		
		try {
			
			System.out.println(icallertunemgmtservice.updateTuneInfoById(1, "bushan", "boder"));
			System.out.println(icallertunemgmtservice.showCallerTuneDetailsById(1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===============================================");
		
		
	}

}
