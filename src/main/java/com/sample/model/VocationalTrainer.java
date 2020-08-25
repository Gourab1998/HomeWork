package com.sample.model;

import javax.persistence.Entity;

@Entity
public class VocationalTrainer extends Employee {
	
	private String currentSession;

	public VocationalTrainer() {
		super();
	}

	public VocationalTrainer(String currentSession) {
		super();
		currentSession = currentSession;
	}

	public String getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(String currentSession) {
		currentSession = currentSession;
	}
	
}
