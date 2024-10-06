package com.nt.entit;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name ="JPA_BLOB")
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class MarriageSeeker {
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	@Column(length = 20)
	private String name ;
	@NonNull
	@Column(length = 20)
	private String addrs;
	
	@NonNull
	@Lob
	private byte[] photo;
	
	@NonNull
	private LocalDateTime dob;
	
	@NonNull
	@Lob
	private char[] biodate;
	
	@NonNull
	private boolean isIndian;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
