package com.example.demo.services;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int emp_Id;
	private String name;
	private String college_name;

	

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_id) {
		this.emp_Id = emp_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
