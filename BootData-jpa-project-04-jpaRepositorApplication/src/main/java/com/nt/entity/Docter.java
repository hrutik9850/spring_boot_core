package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name ="JPA_DOCTER_PAGING")
@Table
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class Docter {
	@Id
	@Column(name = "DOCTERID")
	@SequenceGenerator(name ="get" ,sequenceName =  "SQL_ID",initialValue = 1000,allocationSize = 1 )
	@GeneratedValue(generator = "get",strategy = GenerationType.SEQUENCE)
	private  Integer Id;
	@Column(name = "DOCTER_NAME",length = 25)
	@NonNull
	private String doctName ;	
	@Column(name = "DOCTER_SPECIALISATION",length = 25)
	@NonNull
	private String DoctSpecialisation ;
	
	@Column(name = "LOCATION",length = 25)
	@NonNull
	private String location ;
	
	@Column(name = "DOCTER_ADDRES",length = 25)
	@NonNull
	private String doctAddres ;
	@Column(name = "DOCTER_INCOME")
	@NonNull
	private double doctIncome ;
	@Column(name="DEPTNO")
	@NonNull
	private Integer deptno ;
	
	

}
