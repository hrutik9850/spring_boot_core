package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.ActorData;
import com.nt.service.IActorInfoService;

@RequestMapping("/actor")
@RestController
public class ActerInfoController {
	
	@Autowired
	public IActorInfoService actorService ;

	@PostMapping("/registation")
	public ResponseEntity<String> saveActor(@RequestBody ActorData entity){
		//use service 
		String msg = actorService.register(entity);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/showallactor")
	public ResponseEntity< List<ActorData>> showall(){
			List<ActorData> list =	actorService.showAllActorInfo();
			return new ResponseEntity<List<ActorData>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/actorId/{id}")
	public ResponseEntity<ActorData> actorbyId(@PathVariable int id ){
		ActorData actor = actorService.findbyId(id);
		return new ResponseEntity<ActorData>(actor,HttpStatus.OK);
	}
	@PutMapping("/updated")
	public ResponseEntity<String> updatedActor(@RequestBody ActorData actor){
	String aup = actorService.updateActordata(actor);
	return new ResponseEntity<String>(aup,HttpStatus.OK);
	}
	@PatchMapping("/update/remuneration/{aid}/{remuneration}")
	public ResponseEntity<String> updateRemuneration(@PathVariable int aid,@PathVariable double remuneration){
		String updREm = actorService.updateremuneration(aid, remuneration);
		return  new ResponseEntity<String>(updREm, HttpStatus.OK);
	}
	@PatchMapping("/update/status/{aid}/{Status}")
	public ResponseEntity<String> updateStatus(@PathVariable int aid,@PathVariable String  Status){
		String updREm = actorService.updateStatus(aid, Status);
		return  new ResponseEntity<String>(updREm, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{aid}")
	public ResponseEntity<String> deleteActor(@PathVariable int aid){
		String updREm = actorService.deleteActor(aid);
		return  new ResponseEntity<String>(updREm, HttpStatus.OK);
	}
}
