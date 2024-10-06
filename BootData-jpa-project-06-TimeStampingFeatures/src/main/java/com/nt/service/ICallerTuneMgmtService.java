package com.nt.service;

import com.nt.entity.CallTruenInfo;

public interface ICallerTuneMgmtService {

	public String saveCallerTuneInfo(CallTruenInfo info);
	public String updateTuneInfoById(Integer id ,String tuneName ,String MoveName );
	public CallTruenInfo showCallerTuneDetailsById(Integer id);
}
