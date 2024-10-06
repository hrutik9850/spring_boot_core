package com.nt.sbeans;

import org.springframework.stereotype.Component;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Component("PInfo")
@Data
@ConfigurationProperties(prefix="or.nit")
@PropertySource("App.properties")
public class PatientInfo {
	private String[] loc;
	private	Integer[] mobilno;
	@Value("#{dcc.mobilno}")
	private  Integer hydmoubilno;
	@Value("#{dcc.addrs}")
	private String hyd_addrs;
	private String[] sirjava;
	private String[] sirui;
	
    
	
}
