package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSchedulingProj01Application {

	public static void main(String[] args) {
		System.out.println("start main methoed __________________");
		SpringApplication.run(BootSchedulingProj01Application.class, args);
		System.out.println("App started at::"+new Date());
		System.out.println("Eand main methoed ___________");
	}

}
