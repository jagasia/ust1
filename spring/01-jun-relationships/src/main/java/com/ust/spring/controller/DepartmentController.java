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

import com.ust.spring.entity.Department;
import com.ust.spring.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService ds;
	
	@GetMapping
	public List<Department> retrieveAllDepartments() {
		return ds.read();
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") Integer id) {
		Department department = ds.read(id);
		
		return department;
	}
	
	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		return ds.create(department);
	}
	
	@PutMapping
	public Department updateDepartment(@RequestBody Department department) {
		return ds.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department removeDepartment(@PathVariable("id")Integer id) {
		return ds.delete(id);
	}
	
}
