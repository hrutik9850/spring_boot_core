package com.nt.controller;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

		@GetMapping("/report")
		public String sendData(Map<String,Object> map){
			map.put("favColor", new String[] {"red","green","yellow"});
			map.put("nickName", List.of("raja","raj","mahara"));
			map.put("phoneNumber",Set.of(4444444L,3333333L,543344343L));
			map.put("idDetails",Map.of("adharNo",84940440,"voterid",4345343));
			//return LVN
			return "show_report";
			
		}

	}









