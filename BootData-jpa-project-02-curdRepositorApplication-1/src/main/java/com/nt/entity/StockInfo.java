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
import lombok.RequiredArgsConstructor;
import lombok.NonNull;
@Entity
@Table(name = "STOCK_TAB")
@Data

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class StockInfo {
	
	@Id
	@Column(name = "STOCK_ID")
	@SequenceGenerator(name = "gen1",sequenceName =  "STOCK_SQL",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1" ,strategy = GenerationType.SEQUENCE)
	private Integer stockId ;
	
	@Column(name ="STOCK_NAME",length = 20)
	@NonNull
	private String stockname;
	@Column(name="EXCHANGE_NAME",length = 20)
	@NonNull
	private String exchangeName;
	@Column(name = "COMPANY",length =  20)
	@NonNull
	private String compnny ;
	@Column(name = "PRICE")
	@NonNull
	private Double price;
	@Column(name ="STOCK_TYPE",length =20)
	@NonNull
	private String stockType ;
	
	
	public StockInfo() {
		System.out.println("stockInfo 0 - parameter constructer");
	}

}
