package com.nt.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Version;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="ACTERINFO_DATA")
@Data
public class ActorInfoEntity {
	@Id
	@SequenceGenerator(name ="get",sequenceName = "sql_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "get",strategy = GenerationType.SEQUENCE)
	private Integer aid;
	@Column(length = 30)
	private String aname;
	@Column(length = 30)
	private String adrss;
	private Double remuneration;
	@Column(length = 10)
	private String active_sw ;
	//Meta Data
	@Column(length =30,updatable = false,insertable = true)
	private String createdBy;
	@Column(length =30,updatable = true,insertable = false)
	private String updateBy;
	@CreationTimestamp
	@Column(length = 30,updatable = false,insertable = true)
	private LocalDate creationDate;
	@UpdateTimestamp
	@Column(length = 30,updatable = true,insertable = false)
	private LocalDate updateDate;
	@Version 
	private Integer UpdationCount;

}
