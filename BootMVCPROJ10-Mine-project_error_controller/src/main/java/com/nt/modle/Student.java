package com.nt.modle;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Controller
public class Student {
	private Integer sid;
	private String sname;
	private Double avg;
	private String dept ;
	private String addrs = "hyd";
	private Long moble;

}
