package com.sample.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Scholar extends Employee {
	
	@Autowired
	@ManyToOne
	private VocationalTrainer trainer;
	
	@Autowired
	@OneToOne
	private Scholar buddy;

	public Scholar() {
		super();
	}

	public Scholar(VocationalTrainer trainer, Scholar buddy) {
		super();
		this.trainer = trainer;
		this.buddy = buddy;
	}

	public VocationalTrainer getTrainer() {
		return trainer;
	}

	public void setTrainer(VocationalTrainer trainer) {
		this.trainer = trainer;
	}

	public Scholar getBuddy() {
		return buddy;
	}

	public void setBuddy(Scholar buddy) {
		this.buddy = buddy;
	}

}
