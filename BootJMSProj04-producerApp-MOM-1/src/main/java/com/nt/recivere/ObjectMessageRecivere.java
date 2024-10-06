package com.nt.recivere;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.Entity.ActerInfo;

@Component
public class ObjectMessageRecivere {
	
	@JmsListener(destination="obj_MQ1")
	public void consumerObjectDataMessage(ActerInfo actor) {
		System.out.println("Recivere object Data:"+actor);
	}

}
