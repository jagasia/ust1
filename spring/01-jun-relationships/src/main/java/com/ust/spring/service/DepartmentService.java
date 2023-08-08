package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.Department;
import com.ust.spring.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;
	
	public Department create(Department department) {
		return dr.save(department);
	}
	
	public List<Department> read() {
		return dr.findAll();
	}
	
	public Department read(Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department d=null;
		if(temp.isPresent())
		{
			d=temp.get();
		}
		return d;
	}
	
	public Department update(Department department) {
		Department d = read(department.getId());
		if(d!=null)
		{
			d=department;
			dr.save(d);
		}
		return d;
	}
	
	public Department delete(Integer id) {
		Department d = read(id);
		if(d!=null)
		{			
			dr.delete(d);
		}
		return d;
	}
	
}
