package com.nt.runners;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Docter;
import com.nt.service.IDocterMNGService;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;
@Component
public class DocterManagementRunner implements CommandLineRunner {
	@Autowired
	public IDocterMNGService docterService ;

	@Override
	public void run(String... args) throws Exception {
//		Docter doct1 = new Docter("Ankusha","Brane","Akola","Hingoli",4040000.0,101);
//		Docter doct2 = new Docter("kartika","Hard","Akola","Washim",7020000.0,101);
//		Docter doct3 = new Docter("sunil","liver","Akola","Hingoli",9040000.0,102);
		/*Docter doct4 = new Docter("Ashisha","fatcher","Akola","Hingoli",5040000.0,102);
		
			String addmasg = docterService.recoredAddDocterRepo(doct4);
			System.out.println(addmasg);*/

		/*		try {
				//	docterService.showDocterBySorting(true, "doctName").forEach(System.out::println);
					
					docterService.showDocterBySorting(true, "doctName","location").forEach(System.out::println);
				} catch (Exception e) {
					e.printStackTrace();
				}*/
		/*System.out.println("_________________find all (pageeable pageable)______________________");
		try {
			org.springframework.data.domain.Page<Docter> page = docterService.ShowDocterInfoByPageNo(1,2, false, "doctName");
			System.out.println("page sort page Number"+page.getNumber());
			System.out.println("page sort page counet "+page.getTotalPages());
			System.out.println("page sort page Number"+page.getNumberOfElements());
			System.out.println("page sort page Number"+page.isFirst());
			System.out.println("page sort page Number"+page.isLast());
			System.out.println("page sort page Number"+page.isEmpty());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*		try {
					docterService.ShowDateThroughpagination(2);
					
				} catch (Exception e) {
					e.printStackTrace();
				}*/
		try {
			
			System.out.println(docterService.deletedDocterById(List.of(100,200,400)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
