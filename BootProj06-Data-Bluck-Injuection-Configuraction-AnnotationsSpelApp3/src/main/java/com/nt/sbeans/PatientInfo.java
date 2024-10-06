package com.nt.sbeans;

import org.springframework.stereotype.Component;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Component("PInfo")
@Data
@ConfigurationProperties(prefix="pi")
@PropertySource("App.properties")
public class PatientInfo {
	@Value("1234")
	private Integer pid;
	
	@Value("${offers.name")
	private String name;
	

	private Long mobileNO;
	

	private String addrs;
	
//	@Value("#{dcc.xrayPrice + dcc.ctscanPrice + dcc.ecgPrice}")
	private Double billamount;
//	@Value("#{dcc.ecgPrice<=0}")
	private Boolean ecgFree;
	
	@Value("${offers.idcard}")
	private Float idcard ;
	
	@Value("${offers.adhar}")
	private Float adhar;
	
	@Value("${offers.rashan}")
	private Float rashan ;
	
	@Value("${os.name}")
	private String osName;
	@Value("${path}")
	private String pathData;

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + name + ", mobileno=" + mobileNO + ", paddrs=" + addrs
				+ ", billamount=" + billamount + ", ecgFree=" + ecgFree + ", osName=" + osName + ", pathData="
				+ pathData + ",idcard="+ idcard+",adhar= " + adhar +",rachan= " + rashan +"]";
	}
	
    
	
}
