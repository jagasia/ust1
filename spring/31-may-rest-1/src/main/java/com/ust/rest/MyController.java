package com.ust.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Employee;


@RestController
@RequestMapping("employee")
public class MyController {
	
	@GetMapping("/home")
	public String home()
	{
		return "Hi this is my first restful webservice....still working fine";
	}
	
	@GetMapping
	public Employee getEmployee()
	{
		return new Employee(123, "Ashwin Ashok", "MCA");
	}
	
	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees()
	{
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Ajay", "EEE"));
		empList.add(new Employee(2, "Reenu", "CSE"));
		empList.add(new Employee(3, "Ashwin C", "EEE"));
		empList.add(new Employee(4, "Jag", "ECE"));
		empList.add(new Employee(5, "Dinesh", "MCA"));
		empList.add(new Employee(6, "Muruga Prasad U", "MCA"));
		return empList;
		
	}
	
	@PostMapping
	public Employee addEmployee(Employee employee)
	{
		//under construction
		return employee;
	}
	
	@PutMapping
	public Employee updateEmployee(Employee employee)
	{
		//under construction
		return employee;
	}
	
	@DeleteMapping
	public Employee deleteEmployee(Integer id)
	{
		//under construction
		return new Employee();
	}
}
