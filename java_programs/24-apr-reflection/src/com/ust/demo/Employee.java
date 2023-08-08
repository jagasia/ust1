package com.ust.demo;

@Jag
public class Employee {
	@Jag
	private Integer id;
	private String firstName;
	private String lastName;
	private Double salary;
	
	@Jag
	public Employee() {}

	public Employee(Integer id, String firstName, String lastName, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Jag
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	public void attend()
	{
		System.out.println("Employee attends");
	
	}
	
	@Deprecated
	 void takeLeave()
	{
		
	}
}
