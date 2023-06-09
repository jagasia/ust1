package com.ust.spring;

import org.springframework.stereotype.Component;

//@Component("emp")
public class Employee {
	private Integer id;
	private String name;
	private String department;
	
	public Employee() {}

	public Employee(Integer id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
}
