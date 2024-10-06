package com.nt.service;

import java.util.List;

import com.nt.entity.EmployInfomation;

public interface IEmployInformationService {
	public List<EmployInfomation> showsalarybetween(Double start , Double End );
	public List<EmployInfomation> showDeptnosalGeterthan(Integer deptno, Double sal); 
	public List<EmployInfomation> serchaDeptnameDeptId(Integer deptId1, Integer deptId2);
	public List<Object[]> showLaseSalEmploy(Double howmuchlase);	
	public List<String> ShowEmplynameDeptId(Integer dpNO);
	public Long countDataAtam();
	public Object allAggretedFuncation();
	public int AddComishanJob(double comishan ,String deptname);
	public String systemDate();
	public int createTabpTable();
	

}
