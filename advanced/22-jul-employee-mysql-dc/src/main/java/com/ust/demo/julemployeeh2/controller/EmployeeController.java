package com.ust.demo.julemployeeh2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.julemployeeh2.model.Employee;
import com.ust.demo.julemployeeh2.model.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository er;

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return er.save(employee);
	}
	
	@GetMapping
	public List<Employee> retrieveAllEmployees() {
		return er.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee employee=null;
		if(temp.isPresent())
		{
			employee=temp.get();
		}
		return employee;
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		Employee temp=null;
		temp=findEmployeeById(id);
		if(temp!=null)
		{
			er.save(employee);
			temp=employee;
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable Integer id) {
		Employee temp=null;
		temp=findEmployeeById(id);
		if(temp!=null)
		{
			er.delete(temp);
		}
		return temp;
	}
	
}
