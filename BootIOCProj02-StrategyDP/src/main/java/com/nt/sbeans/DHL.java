package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+" order id  order is  ready for delivery  using DHL courier service";
	}

}
