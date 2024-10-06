package com.nt.sbeans;

import org.springframework.stereotype.Component;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Component("PInfo")
@Data
public class PatientInfo {
	@Value("1234")
	private Integer pid;
	
	@Value("${pi.name}")
	private String pname;
	
	@Value("${pi.mobileNO}")
	private Long mobileno;
	
	@Value("${pi.addrs}")
	private String paddrs;
	
	@Value("#{dcc.xrayPrice + dcc.ctscanPrice + dcc.ecgPrice}")
	private Double billamount;
	@Value("#{dcc.ecgPrice<=0}")
	private Boolean ecgFree;
	
	@Value("${os.name}")
	private String osName;
	@Value("${path}")
	private String pathData;

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileno=" + mobileno + ", paddrs=" + paddrs
				+ ", billamount=" + billamount + ", ecgFree=" + ecgFree + ", osName=" + osName + ", pathData="
				+ pathData + "]";
	}
	
    
	
}
