package com.nt.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorData {
	public Integer aid;	
	public String aname;
	public String adrss;
	private Double remuneration;
	private String active_sw;
	
	

}
