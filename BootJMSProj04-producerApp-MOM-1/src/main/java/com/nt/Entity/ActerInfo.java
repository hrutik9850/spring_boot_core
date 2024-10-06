package com.nt.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class ActerInfo implements Serializable{
	public Integer actorId;
	public String actorName;
	public String actoraddrs;

}
