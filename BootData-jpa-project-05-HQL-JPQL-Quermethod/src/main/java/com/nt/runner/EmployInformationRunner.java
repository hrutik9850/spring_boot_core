package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployInfomation;
import com.nt.repojetery.IEmployInformationRepo;
import com.nt.service.IEmployInformationService;
@Component
public class EmployInformationRunner implements CommandLineRunner {
	@Autowired
	public IEmployInformationService empinfoService;
	@Autowired
	public IEmployInformationRepo empinfoRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("=============================================");
		empinfoRepo.findByid(7369).forEach(System.out::println);
		System.out.println("=============================================");
		empinfoService.showsalarybetween(2000.0, 5000.0).forEach(System.out::println);	
		System.out.println("=============================================");
		empinfoService.showDeptnosalGeterthan(10, 3000.0).forEach(System.out::println);
		System.out.println("==================== query=========================");
		empinfoService.serchaDeptnameDeptId(10, 40).forEach(System.out::println); 		*/
		/*System.out.println("====================select query colume name =========================");
		empinfoService.showLaseSalEmploy(3000.0).forEach(emp ->{
			System.out.println(Arrays.toString(emp));	});*/
		
//		System.out.println("====================  singl comume query  =========================");
//    	empinfoService.ShowEmplynameDeptId(20).forEach(System.out::println);
   	
    	
    	
    // HQL/JPQL aggratge funcation count(*) main(),max(), sum(), mod(), avg(),  	
    	
	/*System.out.println("========================Aggratege funcation ======================");
	
	Long countAtam = empinfoService.countDataAtam();
	System.out.println(countAtam);
	System.out.println("========================Aggratege funcation ======================");
	Object[] obj = (Object[])empinfoService.allAggretedFuncation();
	System.out.println(obj[0]+"Number of recored ");
	System.out.println(obj[1]+"sum of salary ");
	System.out.println(obj[2]+"min of salary ");
	System.out.println(obj[3]+"max of salary ");
	System.out.println(obj[4]+"avg of salary ");
	*/ 
    	System.out.println("======================== update operation to prafrom  ======================");
    	
		/*int record = empinfoService.AddComishanJob( 100,"SALESMAN");
		System.out.println("numbero of Imploy comishan incremaent "+record);
		*/
	System.out.println(empinfoService.systemDate());
	System.out.println("that mucha of table are create :" +empinfoService.createTabpTable());
	
	}

}
