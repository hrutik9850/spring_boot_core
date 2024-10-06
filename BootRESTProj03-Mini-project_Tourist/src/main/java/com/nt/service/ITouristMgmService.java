package com.nt.service;

import java.util.List;

import com.nt.advise.TouristNotFoundExcepation;
import com.nt.entity.Tourist;

public interface ITouristMgmService {
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourists();
	public List<Tourist> showAllTourist();
	//public List<Tourist>showTuristByTid(Integer id) ;
}
