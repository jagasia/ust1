package com.ust.spring.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.spring.entity.Employee;

@FeignClient(name = "emp-api",url = "http://localhost:8080/employee")
public interface EmployeeApi {
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee);
	
	@GetMapping
	public List<Employee> retrieveEmployees();
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id);
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee);
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable("id") Integer id);

}
