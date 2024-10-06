package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootRestProj05ApachiKafkaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestProj05ApachiKafkaProjectApplication.class, args);
	}

}
