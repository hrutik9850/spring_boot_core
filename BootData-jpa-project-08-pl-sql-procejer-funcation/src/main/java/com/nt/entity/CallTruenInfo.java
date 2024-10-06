package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name ="CALLER_TUNE_INFO")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CallTruenInfo {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer truenId ;
		@Column(length =20)
		@NonNull
		private String name ;
		@Column(length =20)
		@NonNull
		private String moveName;
		@Column(name ="UPDATE_COUNT")
		@Version
		private  Integer turnCounter;
		@Column(name ="SERVIC_OPEN_ON")
		@CreationTimestamp
		private LocalDateTime serviceOptedOn;
		@Column(name ="LASTLY-UPDATED-ON")
		@UpdateTimestamp
		private LocalDateTime lastUpdateOn;

}
