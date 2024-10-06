package com.nt.sub;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("emp")
@ConfigurationProperties(prefix = "org.nit")
@Data()
public class Employe {
	
	private Integer eno;
	private String name;
	
	private String[] favColor;
	
	private List<String> nickname;
	private Set<Long> mobilno;
	private Map<String,Object> idDetails;
	
	private Company company;

}
