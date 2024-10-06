package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.services.IpursanserviceIOM;

@Component
public class OToMAssociationMapingRunner implements CommandLineRunner {
	@Autowired
	public IpursanserviceIOM pursanService ;
	

	@Override
	public void run(String... args) throws Exception {
		
		pursanService.saveDaraUsingPrant();
	

	}

}
