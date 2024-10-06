package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.IdocterRepo;
@Component
public class DocterRunner implements CommandLineRunner {
	@Autowired

	public IdocterRepo idocterRepo ;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========================================================================");
		idocterRepo.findBydoctAddres("Hingoli").forEach(System.out::println);
		
		System.out.println("===========================================================================");
		idocterRepo.findBydoctName("Ankusha").forEach(System.out::println);
		System.out.println("===========================================================================");
		idocterRepo.findBydoctIncomeLessThanEqual( 4040000).forEach(System.out::println);
		System.out.println("===========================================================================");
		idocterRepo.findBydoctNameLike("An").forEach(System.out::println);
		System.out.println("===========================================================================");
		idocterRepo.findBydoctNameNotLike("Ankusha").forEach(System.out::println);

	}

}
