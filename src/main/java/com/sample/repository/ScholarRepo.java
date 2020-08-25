package com.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.model.Scholar;


public interface ScholarRepo extends CrudRepository<Scholar, String>{

}
