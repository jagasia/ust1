package com.ust.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.Employee;
import com.ust.spring.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@GetMapping
	public List<Employee> retrieveEmployees() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id) {
		return es.read(id);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable("id") Integer id) {
		return es.delete(id);
	}
	
}
