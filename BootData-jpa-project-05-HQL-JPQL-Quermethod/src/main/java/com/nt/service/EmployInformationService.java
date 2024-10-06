package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployInfomation;
import com.nt.repojetery.IEmployInformationRepo;
@Service
public class EmployInformationService implements IEmployInformationService {
	@Autowired
	public IEmployInformationRepo empInfoRepo ;

	@Override
	public List<EmployInfomation> showsalarybetween(Double start, Double End) {
	
		return empInfoRepo.showSalRecored(start, End);
	}

	@Override
	public List<EmployInfomation> showDeptnosalGeterthan(Integer deptno, Double sal) {
		
		return empInfoRepo.showDeptofSal(deptno, sal);
	}

	@Override
	public List<EmployInfomation> serchaDeptnameDeptId(Integer deptId1, Integer deptId2) {
		
		return empInfoRepo.serchaEmployByDeptnameDependOnDeptId(deptId1, deptId2);
	}

	@Override
	public List<Object[]> showLaseSalEmploy(Double howmuchlase) {
		
		return empInfoRepo.showEmployLeasSal(howmuchlase);
	}

	@Override
	public List<String> ShowEmplynameDeptId(Integer dpNO) {
		
		return empInfoRepo.showEmploynameDependDeptNo(dpNO);
	}

	@Override
	public Long countDataAtam() {
	
		return empInfoRepo.ShowCountData();
	}

	@Override
	public Object allAggretedFuncation() {
		
		return empInfoRepo.ShowSumMinMaxAvg();
	}

	@Override
	public int AddComishanJob(double comishan ,String deptname) {
		int Norecord  = empInfoRepo.AddComishantoParticularDeptname( comishan,deptname);
		return Norecord ;
	}

	@Override
	public String systemDate() {
		
		return empInfoRepo.showDate();
	}

	@Override
	public int createTabpTable() {
		
		return empInfoRepo.createTamptab();
	}

	
	

}
