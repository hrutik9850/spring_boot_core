package com.nt.modle;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name="EMPLOYE_INFO")
@Data
public class EmployeeModle {
	@Id
	@Column(name ="EMPNO")
	@SequenceGenerator(name ="git",sequenceName = "sql_Id",initialValue =10000,allocationSize = 1)
	@GeneratedValue(generator ="git",strategy = GenerationType.AUTO)
	private Integer empno ;
	@Column(name="ENAME",length =25)
	private String empname;
	@Column(name ="Job",length =25)
	private String deptname;
	@Column(name ="MGR")
	private Integer mgr;
	@Column(name ="HIREDATE")
	private LocalDateTime joinDate;
	@Column(name ="SAL")
	private Double salary;
	@Column(name ="COMM")
	private Double comm;
	@Column(name ="DEPTNO")
	private Integer deptno;
	


}
