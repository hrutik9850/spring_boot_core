package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entit.MarriageSeeker;

public interface IMarriageSeekerServiceIMGR {
public String registerMarriageSeeker(MarriageSeeker seeker);
public Optional<MarriageSeeker> searchSeekerById(Long id);
	
	

}
