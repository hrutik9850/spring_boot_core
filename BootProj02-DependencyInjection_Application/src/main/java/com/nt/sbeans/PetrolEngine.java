package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PEng")
public class PetrolEngine  implements IEngine{

	@Override
	public void start() {
		System.out.println("PetrolIEngine:: started ");
		
	}

	@Override
	public void stop() {
		System.out.println("PetrolIEngine:: stop");
		
	}

}
