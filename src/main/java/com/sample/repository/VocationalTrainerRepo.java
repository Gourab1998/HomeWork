package com.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.model.VocationalTrainer;

public interface VocationalTrainerRepo extends CrudRepository<VocationalTrainer, String> {

}
