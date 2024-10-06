package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.binding.ActorData;
import com.nt.entity.ActorInfoEntity;
import com.nt.repositary.ActorInfoRepo;
@Service
public class ActorInfoService implements IActorInfoService{

	@Autowired
	public ActorInfoRepo actorrepo;
	@Value("${user.name}")
	public String osname;
	@Override
	public String registerActor(ActorData data) {
		//converting Binding object data to Entity object data
		ActorInfoEntity entity =  new ActorInfoEntity();
		BeanUtils.copyProperties(data, entity);
		//set Data meta ot Entity object 
		entity.setCreatedBy(osname);
		entity.setUpdateBy(osname);
		int idval =actorrepo.save(entity).getAid();
		return "Actor is saved with the id value :"+idval;
	}

}
