package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.*;
import com.sample.model.*;

@RestController
public class ApiHandler {
	
	@Autowired
	private ScholarService scholarService;
	@Autowired
	private VocationalTrainerService vocationalTrainerService;
	
	@PostMapping("/addScholar")
	public void addScholar(@RequestBody Scholar scholar) {
		scholarService.add(scholar);
	}
	@GetMapping("/getScholars")
	public List<Scholar> getScholars() {
		return scholarService.getAll();
	}
	@GetMapping("/getScholar/{ino}")
	public Scholar getScholar(@PathVariable String ino) {
		return scholarService.get(ino);
	}
	@DeleteMapping("/delScholar/{ino}")
	public void delScholar(@PathVariable String ino){
		scholarService.del(ino);
	}
	@PutMapping("/putScholar")
	public void putScholar(@RequestBody Scholar scholar) {
		scholarService.put(scholar);
	}
	
	@PostMapping("/addVocationalTrainer")
	public void addVocationalTrainer(@RequestBody VocationalTrainer vocationalTrainer) {
		vocationalTrainerService.add(vocationalTrainer);
	}
	@GetMapping("/getVocationalTrainers")
	public List<VocationalTrainer> getVocationalTrainer() {
		return vocationalTrainerService.getAll();
	}
	@DeleteMapping("/delVocationalTrainer/{id}")
	public void delVocationalTrainer(@PathVariable String id) {
		
	}
	@PutMapping("/putVocationalTrainer/{id}")
	public void putScholar(@RequestBody VocationalTrainer vocationalTrainer) {
		
	}
}
