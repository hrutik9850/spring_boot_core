package com.nt.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		

//Using LAMDA Style anonyomous inner class

		template.send("testmq1",ses->ses.createTextMessage("From sender ::"+new Date()));
		System.out.println("Message sent");

		// <<-----------or----------->>//

		/*				 //using LAMDA Stryle anoyomous inner class
						 template.send("testmq1",ses->{
							 return ses.createTextMessage("From sender at"+new Date());
						 });
						 */
				 
		// <<-----------or----------->>//

		// Using anonymous inner class logics
//		@Scheduled(cron ="*/10 * * * * *")
	/*		template.send("testmq1",new MessageCreator() {
				@Override
				public Message createMessage(Session ses )throws  JMSException{
					Message message = ses.createTextMessage("From Sender at ::"+ new Date());
					return message;
				}
				
			});*/
		
	}

}
