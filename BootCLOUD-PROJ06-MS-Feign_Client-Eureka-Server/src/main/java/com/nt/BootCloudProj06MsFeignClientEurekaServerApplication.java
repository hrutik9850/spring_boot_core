package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootCloudProj06MsFeignClientEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudProj06MsFeignClientEurekaServerApplication.class, args);
	}

}
