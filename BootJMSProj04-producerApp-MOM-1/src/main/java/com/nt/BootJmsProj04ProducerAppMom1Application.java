package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class BootJmsProj04ProducerAppMom1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj04ProducerAppMom1Application.class, args);
	}

}
