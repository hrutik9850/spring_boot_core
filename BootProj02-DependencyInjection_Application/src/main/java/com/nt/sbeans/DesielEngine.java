package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("DEng")

public class DesielEngine implements IEngine{

	@Override
	public void start() {
		System.out.println("DesielEngine:: start");
		
	}

	@Override
	public void stop() {
		System.out.println("DesielEngine:: stop");
		
	}

}
