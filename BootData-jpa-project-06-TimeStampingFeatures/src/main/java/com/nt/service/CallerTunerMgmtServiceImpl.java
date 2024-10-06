package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CallTruenInfo;
import com.nt.repojetery.ICallerTuneInfo;
@Service("callerTuneService")
public class CallerTunerMgmtServiceImpl implements ICallerTuneMgmtService {

	@Autowired
	private  ICallerTuneInfo callerTuneRepo;
	@Override
	public String saveCallerTuneInfo(CallTruenInfo info) {
		Integer idVal = callerTuneRepo.save(info).getTruenId();
		return "callerTune is  saved with the id Value ::"+idVal;
	}

	@Override
	public String updateTuneInfoById(Integer id, String tuneName, String MoveName) {
		Optional<CallTruenInfo> opt = callerTuneRepo.findById(id);
		if(opt.isPresent()) {
			CallTruenInfo info = opt.get();
			info.setName(tuneName);
			info.setMoveName(MoveName);
			CallTruenInfo tune = callerTuneRepo.save(info);
			return "Object is update for"+tune.getTurnCounter()+"times....lastly modified on:"
																	+tune.getLastUpdateOn()+"create on.."+tune.getServiceOptedOn();
			
			
		}
		return "CallTruen is not found ";
	}

	@Override
	public CallTruenInfo showCallerTuneDetailsById(Integer id) {
		
		return callerTuneRepo.findById(id).orElseThrow(()->new IllegalArgumentException("caller tune no found"));
	}

}
