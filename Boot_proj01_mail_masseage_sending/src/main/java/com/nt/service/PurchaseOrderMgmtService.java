package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


import jakarta.mail.internet.MimeMessage;

@Service("purchaseorder")
public class PurchaseOrderMgmtService implements IpurchaseOrderMgmtService {
	@Value("${spring.mail.username")
	public String from_mail ;
	
	@Autowired
	public  JavaMailSender sender;


	@Override
	public String purchase(String[] items, double[] pricess, String[] emailid) throws Exception {
		
		double billAmt = 0.0;
		for (double p:pricess) {
			billAmt = billAmt ;
		}
		String msg = Arrays.toString(items)+
				"are purchsed having prices "+Arrays.toString(pricess)+"with  the bill Amt:: " +billAmt;
		String mailstatus = send_mail(msg,emailid);
		
		return msg +"......>"+mailstatus;
	}
	private String send_mail(String messagebody, String []ToEmail)throws Exception{
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(from_mail);
		helper.setTo(ToEmail);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(messagebody);
		helper.addAttachment("hrutik.jpg",new ClassPathResource("hrutik.jpg"));
	    sender.send(message);
		
		return "mail has been send ";
	}
	
	
	

}
