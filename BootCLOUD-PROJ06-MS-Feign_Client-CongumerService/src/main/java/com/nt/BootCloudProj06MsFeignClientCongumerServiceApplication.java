package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootCloudProj06MsFeignClientCongumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudProj06MsFeignClientCongumerServiceApplication.class, args);
	}

}
