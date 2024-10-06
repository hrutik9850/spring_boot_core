package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "JPA_OTM_PURSANE ")
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {
	@Id
	@SequenceGenerator(name ="gen2",sequenceName = "SEQ_NAME",allocationSize = 100,initialValue = 1 )
	@GeneratedValue(generator =  "gen2",strategy = GenerationType.SEQUENCE)	
	private Integer pid ;
	@Column(length = 20)
	@NonNull
	private String pname ;
	@Column(length = 20)
	@NonNull
	private String paddres ;
	
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)//mappedBy = "personinfo")
	@JoinColumn(name ="PERSON_ID",referencedColumnName ="PID")
	private Set<PhoneNumber> contactDetil ;


	@Override
	public String toString() {
		return "Person [id=" + pid + ", pname=" + pname + ", paddres=" + paddres + "]";
	}
	
	public Person() {
		System.out.println("Person:0-parm metter :");
	}

}
