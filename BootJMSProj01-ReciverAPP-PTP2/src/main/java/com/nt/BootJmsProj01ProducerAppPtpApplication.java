package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
public class BootJmsProj01ProducerAppPtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj01ProducerAppPtpApplication.class, args);
	}

}
