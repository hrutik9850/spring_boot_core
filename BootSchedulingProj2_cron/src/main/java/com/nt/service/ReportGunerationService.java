package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class ReportGunerationService {
	/*@Scheduled(cron ="0 43 20 * * * ")
	public void showCrone() {
		System.out.println("Sale Repo Date::"+new Date());
		
	}*/
	
	/*	@Scheduled(cron ="45 27 21 * * * ")
		public void showCrone() {
			System.out.println("Sale Repo Date::"+new Date());
			
		}*/
	/*	@Scheduled(cron ="20 43 21 * * 7 ")
		public void showCrone() {
			System.out.println("Sale Repo Date::"+new Date());
			
		}
			*/
	/*@Scheduled(cron ="0/20 * * * * * ")
	public void showCrone() {
		System.out.println("Sale Repo Date::"+new Date());
		
	}*/
	/*@Scheduled(cron ="0/20 52-54 * * * * ")
	public void showCrone() {
		System.out.println("Sale Repo Date::"+new Date());
		
	}*/
	@Scheduled(cron ="0/20 52-54 * * * * ")
	public void showCrone() {
		System.out.println("Sale Repo Date::"+new Date());
		
	}
		
	
	
	
}
