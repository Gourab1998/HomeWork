package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.Scholar;
import com.sample.repository.ScholarRepo;

@Service
public class ScholarService {
	@Autowired
	private ScholarRepo scholarRepo;

	public void add(Scholar scholar) {
		scholarRepo.save(scholar);
	}

	public List<Scholar> getAll() {
		return (List<Scholar>) scholarRepo.findAll();
	}

	public void del(String ino) {
		scholarRepo.deleteById(ino);
	}

	public void put(Scholar scholar) {
		scholarRepo.save(scholar);
	}

	public Scholar get(String ino) {
		return scholarRepo.findById(ino).get();
	}

}
