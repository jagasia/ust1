package com.ust.spring.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee e=null;
		if(temp.isPresent())
		{
			e=temp.get();
		}
		return e;			
	}
	public Employee update(Employee employee) {
		Employee e = read(employee.getId());
		if(e!=null)
		{
			e=employee;
			er.save(e);
		}
		return e;
	}
	public Employee delete(Integer id) {
		Employee e=read(id);
		if(e!=null)
		{
			er.delete(e);
		}
		return e;
	}
	
}
