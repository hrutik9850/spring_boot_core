package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("catalog")
@Data
public class CourseCatalog {
	@Value("${java.fee}")
	private Double javaCourseFee;

	@Value("${donet.fee}")
	private Double dotNetCourseFee;

	@Value("${python.fee}")
	private Double pythonCourseFee;
	
	@Value("${andriod.fee}")
	private Double andriodCourseFee;
	
	@Value("${ui.fee}")
	private Double UICourseFee;

	

}
