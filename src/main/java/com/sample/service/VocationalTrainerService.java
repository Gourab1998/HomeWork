package com.sample.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.Scholar;
import com.sample.model.VocationalTrainer;
import com.sample.repository.VocationalTrainerRepo;

@Service
public class VocationalTrainerService {
	@Autowired
	private VocationalTrainerRepo vocationalTrainerRepo;

	public void add(VocationalTrainer vocationalTrainer) {
		vocationalTrainerRepo.save(vocationalTrainer);
	}

	public List<VocationalTrainer> getAll() {
		return (List<VocationalTrainer>) vocationalTrainerRepo.findAll();
	}
	
}
