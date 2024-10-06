package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class ReportGunerationService {
	
	/*
	@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void generatedrepord () {
		System.out.println("generatedrepord ::"+new Date());
	}*/
	
	/*@Scheduled(fixedDelay = 2000)
	public void generatedrepord () {
		System.out.println("generatedrepord ::"+new Date());
	
	*/
	/*	@Scheduled(fixedDelay=3000)
		public void generateReport() {
			System.out.println("Sales Report of ::"+new Date()+"start");
			try {
				Thread.sleep(15000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("end of salesReport"+new Date()+"End thred");
		}*/	
		
	/*	@Scheduled(fixedDelay=3000)
		public void generateReport() {
			System.out.println("Sales Report of ::"+new Date()+"start");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("end of salesReport"+new Date()+"End thred");
		}	
	*/	
	/*@Scheduled(fixedDelayString="3000")
	public void generateReport() {
		System.out.println("Sales Report of ::"+new Date()+"start");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end of salesReport"+new Date()+"End thred");
	}	*/
	/*	@Scheduled(fixedRate=10000)
		public void generateReport() {
			System.out.println("Sales Report of ::"+new Date()+"start");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("end of salesReport"+new Date()+"End thred");
		}*/
	/*@Scheduled(fixedRate =10000)
	public void generateReport() {
		System.out.println("Sales Report of ::"+new Date()+"start");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end of salesReport"+new Date()+"End thred");
	}	*/
	
	
		//@Scheduled(initialDelay = 30000,fixedRate = 50000)
		//@Scheduled(fixedDelay = 5000)
		/*@Scheduled(fixedDelayString = "5000")
		public void generateReport() {
			System.out.println("thred (task1 )name ::"+Thread.currentThread().getName());
			System.out.println("thread(task1 )hashCode::"+Thread.currentThread().hashCode());
			System.out.println("Report Data1 on "+new Date());
			
		}	  */
		
	@Scheduled(fixedRate = 50000,initialDelay = 30000)
		public void generateReport() {
			System.out.println("thred (task1 )name ::"+Thread.currentThread().getName());
			System.out.println("thread(task1 )hashCode::"+Thread.currentThread().hashCode());
			System.out.println("Report Data1 on "+new Date());
			
		}	  
		
}
