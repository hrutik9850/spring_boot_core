package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	
	@Autowired
	private DiscoveryClient client; //comes through autoConfiguration 
	
	
	public String getBillingInfo() {
		//find and get SErviceInstances of producer by Using Service Id 
		List<ServiceInstance> listI = client.getInstances("BootCLOUD-PROJ03-MS-Billing-Service-MS");
		//user first ServiceInstance from the List of Instances
		ServiceInstance sI = listI.get(0);
		//get Producer MS URI and make it as URL
		String url =sI.getUri()+"/billing/info";
		//create RestTemplate object 
		RestTemplate tamplate = new RestTemplate();
		// invoke producer MS service method or operation by generating Http call
		String resp = tamplate.getForObject(url,String.class);
		return resp;
	}
}
