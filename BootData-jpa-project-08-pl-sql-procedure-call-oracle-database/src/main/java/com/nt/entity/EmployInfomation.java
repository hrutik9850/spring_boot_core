package com.nt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="EMPLOYE_INFO")
@Setter
@Getter
@ToString
@EqualsAndHashCode
//@AllArgsConstructor
//@RequiredArgsConstructor
public class EmployInfomation {
	@Id
	@Column(name ="EMPNO")
	@SequenceGenerator(name = "git",sequenceName = "SQL_ID", initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator ="git",strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column(name ="Ename",length = 25)
	@NonNull
	private String empname ;
	@Column(name ="JOB",length = 25)
	@NonNull
	private String deptname;
	@Column(name ="MGR")
	@NonNull
	private Integer mgr;
	@Column(name ="HIREDATE")
	@NonNull
	private Date joinDate ;
	@Column(name="SAL")
	@NonNull
	private Double salary;
	@Column(name="COMM")
	@NonNull
	private Double comm;
	@Column(name ="DEPTNO")
	@NonNull
	private Integer deptno;


}
