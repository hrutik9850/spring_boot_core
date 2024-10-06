package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("inst")
@Data
public class TraininigInistitute {
	   //hard coded value
	@Value("1001")
   private  Integer  instId;
	  //collected from the oroperties file file
	@Value("${inst.name}")
	private  String  instName; 
	@Value("${inst.addrs}")
	private   String   instAddrs;
	@Value("${inst.contactNo}")
	private   String   mobileNo;
	// SPEL Airthmetic opeation
	@Value("#{catalog.javaCourseFee + catalog.UICourseFee+  catalog.andriodCourseFee}")
	private  double   totalCourseFee;
	//SPEL Logical opeation
	@Value("#{catalog.javaCourseFee>5000}")
	private  boolean isJavaCourseFeeHigh;
	
	//@Value performing system property values
	@Value("${os.name}")
	 private  String osName;
	@Value("${os.version}")
	 private  String osVersion;
	
	//@Value injecting the   Path env.. variable value
	@Value("${path}")
	private  String  pathData;
}
