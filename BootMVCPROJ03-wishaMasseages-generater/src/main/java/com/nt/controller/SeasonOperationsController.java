package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonOperationsController {
	@Autowired
private ISeasonFinderService service;
	
	
	
	@RequestMapping("/")
	public String showHomw() {
		return "welcome";
	}
	@RequestMapping("/desplay")
	public String showSeason(Map<String ,Object>map) {
		String msg = service.finderSeason();
		map.put("resultMsg", msg);
		return "season";
	}
}
