package com.nt.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repojeter.IpersonRepojeter;
import com.nt.repojeter.IphonNumberRepojeter;
@Service
public class OTOMAssociationMappingServiceImpl implements IpursanserviceIOM {
	@Autowired
	public IpersonRepojeter personRepo;
	
	@Autowired
	public IphonNumberRepojeter phoneRepo;


	@Override
	public void saveDaraUsingPrant() {
		//create Parent object 
		Person per = new Person("hrutik","akola");
		//create child object 
		PhoneNumber ph1 = new PhoneNumber(88855555L,"airtel","personal");
		PhoneNumber ph2 = new PhoneNumber(88222222L,"BSNL","office");
		//add parent to child 
		ph1.setPerson(per);ph2.setPerson(per);
		//add parent to child 
		per.setContactDetil(Set.of(ph1,ph2));
		
		//save the parent object 
	int id =personRepo.save(per).getPid();
		System.err.println("parson and this associated phoneNumber are saved (parent to child):="+id);
		
		
	}//method

}
