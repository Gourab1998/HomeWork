package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Employee {
	@Id
	@Column(length = 64)
	private String ino;
	private String name;
	private String dept;

	public Employee() {
	}

	public Employee(String ino, String name, String dept) {
		super();
		this.ino = ino;
		this.name = name;
		this.dept = dept;
	}

	public String getIno() {
		return ino;
	}

	public void setIno(String ino) {
		this.ino = ino;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
