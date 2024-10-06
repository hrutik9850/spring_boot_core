package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployInfomation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/*CREATE OR REPLACE PROCEDURE p_get_employ_by_income_range 
(
    startincome IN NUMBER,
    endincome IN NUMBER,
    details OUT SYS_REFCURSOR
) AS
BEGIN
    OPEN details FOR
    SELECT * 
    FROM EMPLOYE_INFO 
    WHERE sal >= startincome AND sal <= endincome;
END p_get_employ_by_income_range;
/

*/

@Service
public class EmployInformationService implements IEmployInformationService {
	@Autowired
	private EntityManager manager ;

	@Override
	public List<EmployInfomation> showsalaryrangemploy(Double  start, Double  end) {
		
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_EMPLOY_BY_INCOME_RANGE",EmployInfomation.class);
		
		//register both IN,OUT,params
		query.registerStoredProcedureParameter(1,Float.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2,Float.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3,Object.class,ParameterMode.REF_CURSOR);
		
		query.setParameter(1,start);
		query.setParameter(2,end);
		
	
		//exeecute the plsql procedure
		List<EmployInfomation> list = query.getResultList(); 
		return list;
	}

	@Override
	public List<EmployInfomation> showdeptIdsalrangemploy(Integer deptid, Double start, Double end) {
		/*
		CREATE OR REPLACE PROCEDURE P_EMPLOYE_INFO_DEPTID_SAL_RANG (
			    p_deptno IN NUMBER,
			    p_start IN NUMBER,
			    p_end IN NUMBER,
			    details OUT SYS_REFCURSOR
			) AS 
			BEGIN
			    OPEN details FOR
			    SELECT * 
			    FROM EMPLOYE_INFO 
			    WHERE deptno = p_deptno 
			      AND sal >= p_start 
			      AND sal <= p_end;
			END P_EMPLOYE_INFO_DEPTID_SAL_RANG;
			
			*/
		
		
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_EMPLOYE_INFO_DEPTID_SAL_RANG",EmployInfomation.class);
			
		query.registerStoredProcedureParameter(1,Integer.class , ParameterMode.IN);
		query.registerStoredProcedureParameter(2,Float.class , ParameterMode.IN);
		query.registerStoredProcedureParameter(3,Float.class , ParameterMode.IN);
		query.registerStoredProcedureParameter(4,Object.class , ParameterMode.REF_CURSOR);
		
		query.setParameter(1, deptid );
		query.setParameter(2, start);
		query.setParameter(3, end);
		
		List<EmployInfomation> list = query.getResultList();
		
		
		return list;
	}
	
	
	

	
	

	
	

}
