package com.example.demo;

public class Employee {
	private Integer id;
	private String firstName, lastName, department;
	
	public Employee() {}

	public Employee(Integer id, String firstName, String lastName, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}
	
}
