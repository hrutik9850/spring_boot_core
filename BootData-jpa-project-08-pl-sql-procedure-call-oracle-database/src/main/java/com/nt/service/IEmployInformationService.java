package com.nt.service;

import java.util.List;

import com.nt.entity.EmployInfomation;

public interface IEmployInformationService {
	
	public List<EmployInfomation> showsalaryrangemploy(Double  start, Double end  );
	public List<EmployInfomation> showdeptIdsalrangemploy(Integer deptid ,Double start ,Double end );
	

}
