package com.nt.repojetery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.entity.EmployInfomation;

import jakarta.transaction.Transactional;

@Component
public interface IEmployInformationRepo
		extends JpaRepository<EmployInfomation,Integer >, CrudRepository<EmployInfomation,Integer>, PagingAndSortingRepository<EmployInfomation, Integer> {
	public Iterable<EmployInfomation> findByid(Integer id );
//	@Query("from EmployInfomation where salary >=?1 AND salary <= ?2")
//	@Query("from com.nt.entity.EmployInfomation where salary >=?1 AND salary <= ?2")
//	@Query("from EmployInfomation emp where emp.salary >=?1 AND emp.salary <= ?2")
//	@Query("from EmployInfomation emp where emp.salary >=? AND emp.salary <= ?")   //<<- IllegalArgumentException
//	@Query("select emp from EmployInfomation emp where emp.salary >=?1 AND emp.salary <= ?2")
//	@Query("from EmployInfomation where salary >=start  AND salary <= end ")           //Exception 
//	public List<EmployInfomation> showSalRecored(@Param("start")Double start1 ,@Param("end") Double end2 );
	@Query("from EmployInfomation where salary >=?1  AND salary <= ?2 ")          
	public List<EmployInfomation> showSalRecored(Double start , Double end );
	@Query("from EmployInfomation where deptno = ?1 AND salary <=?2")
	public List<EmployInfomation> showDeptofSal(Integer deptno, Double sal );
	
	
	
	
	//---------------------------- ENTITY QUERY----------------------------
	@Query("FROM EmployInfomation WHERE deptno In(:DN1,:DN2) ORDER BY deptname")
	public List<EmployInfomation> serchaEmployByDeptnameDependOnDeptId(Integer DN1,Integer DN2);
	//----------------------------SELECT QUERY----------------------------
	@Query("select id ,mgr ,salary, empname,comm from EmployInfomation where salary<:lase ")
	public List<Object[]> showEmployLeasSal(Double lase);
	//-------------------------------form singl colume -------------------------
	@Query("select empname  from EmployInfomation where deptno = :dpno")
	public List<String> showEmploynameDependDeptNo (Integer dpno);
	
	//---------------------------aggreted funcation 
	
	@Query("select count(*) from EmployInfomation")
	public Long ShowCountData();
	
	
	@Query(" select count(*),sum(salary),min(salary),max(salary),avg(salary) from  EmployInfomation")
	public Object ShowSumMinMaxAvg();
	
	
	//-----------------------------jpql//hql---------------update-alter-create--------------
	@Modifying
	@Transactional
	@Query(value="update EmployInfomation set comm = comm + ?1 where deptname  = ?2")
	public int AddComishantoParticularDeptname( double comishan ,String deptname);
	
	
	@Modifying
	@Transactional
	@Query(value = "create table opp (col1 varchar(10))",nativeQuery = true)
	public int createTamptab();
	
	@Query(value="select sysdate from dual",nativeQuery =true)
	public String showDate();
	
	
	
	
	
}
