package com.nt.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ActorInfo  implements Serializable{
	
	public Integer actorId;
	public String actorName;
	public String actoraddrs;

}
