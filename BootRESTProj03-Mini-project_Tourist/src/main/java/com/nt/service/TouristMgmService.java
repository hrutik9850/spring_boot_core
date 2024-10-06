package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.advise.TouristNotFoundExcepation;
import com.nt.entity.Tourist;
import com.nt.repo.ITouristRepo;

@Service("touristService")
public class TouristMgmService implements ITouristMgmService{

	@Autowired
	private ITouristRepo touristrepo ;

	@Override
	public String registerTourist(Tourist tourist) {
		int idval =touristrepo.save(tourist).getTid();
		
		return "Tourist is registerd having the id value::"+idval;
	}

	@Override
	public List<Tourist> fetchAllTourists() {
		List<Tourist> list = touristrepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo((t2.getTid())));
		return list;
	}

	@Override
	public List<Tourist> showAllTourist() {
		
		return touristrepo.findAll().stream().sorted((t1,t2)->t1.getTid()<t2.getTid()?1:-1).toList();
	}



	
}

	
