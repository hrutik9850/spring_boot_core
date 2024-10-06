package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IpurchaseOrderMgmtService;

@Component
public class Boot_mail_TextRunner implements CommandLineRunner {
	
	@Autowired
	private IpurchaseOrderMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		String msg = service.purchase(new String[] {"shirt","trowuser","nat"}, new double[] {500.0,6000.0,2000.0},new String[] {
				
				"hrutikdharamkar@gmail.com","rutikdharamkar7620@gmail.com"
		});
		System.out.println(msg);
	
	}

}
