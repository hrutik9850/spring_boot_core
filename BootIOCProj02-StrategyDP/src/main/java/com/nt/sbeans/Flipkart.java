package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("supplier")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	
	public  String  purchase(String items[],
			                                     double prices[]) {
		System.out.println("Flipkart.purchase()");
		double billamt=0.0;
		for(double p:prices) {
			billamt+=p;
		}
		//generate the order id randomly
		int oid=new Random().nextInt(10000);
		//use  courier service
		String  courierMsg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having the billAmt::"+billamt+"...."+courierMsg;
	}

}
