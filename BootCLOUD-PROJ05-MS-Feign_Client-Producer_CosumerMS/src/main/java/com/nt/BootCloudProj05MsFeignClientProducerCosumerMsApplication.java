package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@Enable
public class BootCloudProj05MsFeignClientProducerCosumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudProj05MsFeignClientProducerCosumerMsApplication.class, args);
	}

}
