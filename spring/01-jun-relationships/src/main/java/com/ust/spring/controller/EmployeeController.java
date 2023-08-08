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
	
	@GetMapping
	public List<Employee> retrieveAllEmployees() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") Integer id) {
		return es.read(id);
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee removeEmployee(@PathVariable("id")Integer id) {
		return es.delete(id);
	}
	
}
