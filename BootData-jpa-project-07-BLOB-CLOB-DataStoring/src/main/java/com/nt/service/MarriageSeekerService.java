package com.nt.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entit.MarriageSeeker;
import com.nt.repojeter.IMarriageSeekerRepojeter;
@Service("matrimonyService")
public class MarriageSeekerService implements IMarriageSeekerServiceIMGR {
	@Autowired
	private IMarriageSeekerRepojeter marriageRepo ;
	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
	
		return "Marriage Seeker info is saved with id  value "+marriageRepo.save(seeker).getId() ;
	}

	@Override
	public Optional<MarriageSeeker> searchSeekerById(Long id) {
		
		return marriageRepo.findById(id);
	}

}
