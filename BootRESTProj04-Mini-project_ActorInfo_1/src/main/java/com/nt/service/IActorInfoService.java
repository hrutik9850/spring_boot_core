package com.nt.service;

import java.util.List;

import com.nt.binding.ActorData;

public interface IActorInfoService {
	public String  register(ActorData data);
	public List<ActorData> showAllActorInfo();
	public ActorData findbyId(int id);
	public String updateActordata(ActorData acter);
	public String updateremuneration(int aid , double remuneration);
	public String updateStatus(int aid, String status);
	public String deleteActor(Integer aid);
	
}
