package com.nt.client;



import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {

	@Autowired
	private LoadBalancerClient client ;
	
	public String getBillingInfo() {
		//Get Billing-service instance form eureka server based Loadfacter 
		ServiceInstance instance = client.choose("BootCLOUD-PROJ04-MS-LBC-Billing-Service-produserMS");
		//get details form service instance
		URI uri = instance.getUri();
		//Prepare provider MS  related url to cosume method 
		String url =uri.toString()+"/billing/api/info";
		//create RestTemplate class obj to  cosume the provider service
		RestTemplate template = new RestTemplate();
		
		//consume the provider service
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		//get response content from ResponseEntity object
		String responseContent = response.getBody();
		return responseContent ;
	
	}
}
