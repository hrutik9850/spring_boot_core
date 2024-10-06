package com.nt.MOM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.Entity.ActorInfo;

@Component
public class ObjectMassageSender {
	
	@Autowired
	public JmsTemplate template ;
	@Scheduled(cron ="0/20 * * * * * ")
	public  void sendobjectDataMessage () {
		ActorInfo act = new ActorInfo(101,"rama" ,"akola");
		template.convertAndSend("obj_MQ1",act);
		System.out.println("Object is Sender as Message");
	}

}
