package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Tourist {
	
	@Id
	@SequenceGenerator(name ="get",sequenceName = "sql_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "get",strategy = GenerationType.SEQUENCE)
	private Integer tid;
	@Column(length=30)
	@NonNull
	private String name;
	@Column(length=40)
	@NonNull
	private String city;
	@Column(length=50)
	@NonNull
	private String packagetype;
	@NonNull
	private Double budget;
	

}
