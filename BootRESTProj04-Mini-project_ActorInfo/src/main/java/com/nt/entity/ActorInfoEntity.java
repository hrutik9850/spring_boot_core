package com.nt.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

import lombok.Data;


@Entity
@Table(name ="ActorInfo")
@Data

public class ActorInfoEntity {
	@Id
	@SequenceGenerator(name ="get",sequenceName = "sql_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "get",strategy = GenerationType.SEQUENCE)
	private Integer aid;
	@Column(length = 30)

	private String aname ;	
	@Column(length = 30)

	private String addrs;
	
	private Double remuneration;
	@Column(length = 30)

	private String active_sw;
	// meta data
	@Column(length = 30,updatable =false,insertable = true)
	private String createdBy;
	@Column(length = 30,updatable =true,insertable = false)
	private String updateBy;
	@Column(updatable =false,insertable = true)
	private LocalDate creationDate;
	@Column(updatable =true,insertable = false)
	private LocalDate updationDate;
	@Version
	private Integer  UpdationCount;

}
