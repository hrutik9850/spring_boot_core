package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.binding.ActorData;
import com.nt.entity.ActorInfoEntity;
import com.nt.repogitery.IActorInfoRepogitery;
@Service
public class ActerInfoService implements IActorInfoService {

		@Autowired
		public IActorInfoRepogitery actorRep;
		@Value("${user.name}")
		public String osname;
	@Override
	public String register(ActorData data) {
		ActorInfoEntity actor = new ActorInfoEntity();
		BeanUtils.copyProperties(data, actor);
		actor.setCreatedBy(osname);
		actor.setUpdateBy(osname);
		int aid = actorRep.save(actor).getAid();
		return "Actor is saved with the id value:"+aid;
	}
	@Override
	public List<ActorData> showAllActorInfo() {
		// use repo
		//old logic
		List<ActorInfoEntity> listEntity = actorRep.findAll();
		//conver of list of Entity ot list binding class
		/*List<ActorData> listData = new  ArrayList();
		for(ActorInfoEntity entity : listEntity) {
			ActorData data = new ActorData();
			BeanUtils.copyProperties(entity, data);
			listData.add(data);
		}*/
		
		
		List<ActorData> listData =listEntity.stream().map(entity->{ActorData data = new ActorData();
														BeanUtils.copyProperties(entity, data);
														return  data;}).collect(Collectors.toList());
		return listData;
		
	}
	@Override
	public ActorData findbyId(int id) {
		//user repo
		
			ActorInfoEntity list = 	actorRep.findById(id).orElseThrow(()->new IllegalArgumentException("not found Actor id "));
			
			// copy to binding data 
			ActorData actor = new ActorData();
			BeanUtils.copyProperties(list, actor);
	return actor;
	}
	@Override
	public String updateActordata(ActorData acter) {
		ActorInfoEntity list = 	actorRep.findById(acter.getAid()).orElseThrow(()->new IllegalArgumentException("not found Actor id "));
	//copy  ActorData obj data to  actorInfo obj
		BeanUtils.copyProperties(acter, list);
		list.setUpdateBy(osname);
		//update the object 
		int idval = actorRep.save(list).getAid();
		
			
		return idval+"Actor data is updated";
	}
	@Override
	public String updateremuneration(int aid, double remuneration) {
		ActorInfoEntity list = actorRep.findById(aid).orElseThrow(()->new IllegalArgumentException("not found actor data "));
//cop to binding data ();
		list.setRemuneration(remuneration);
		list.setUpdateBy(osname);
		int udid = actorRep.save(list).getAid();
		return udid+"remuneration will be upddated";
	}
	@Override
	public String updateStatus(int aid, String actuve_sw) {
		ActorInfoEntity list = actorRep.findById(aid).orElseThrow(()->new IllegalArgumentException("not found actor data "));
//cop to binding data ();
		list.setActive_sw(actuve_sw);
		list.setUpdateBy(osname);
		int udid = actorRep.save(list).getAid();
		return udid+"remuneration will be upddated";
	}
	@Override
	public String deleteActor(Integer aid) {
		ActorInfoEntity actor = actorRep.findById(aid).orElseThrow(()->new IllegalArgumentException("not found Actor data "));
		actorRep.delete(actor);
		
		return" Delete a Actor data";
		
	}

}
