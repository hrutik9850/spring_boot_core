package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service") //target MS Service Id 
public interface IBillingServiceRestConsumer {
	@GetMapping("/billing/api/info")
	public String fetchBillDetails();
			//can be any name no standerd to fallow 
}
