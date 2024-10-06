package com.nt.reciver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class JMSMeassesConsumer  {
	
@JmsListener(destination = "testmq1")
public void readMessage(String text) {
	
	System.out.println("Recived message::"+text);
}


	

}
