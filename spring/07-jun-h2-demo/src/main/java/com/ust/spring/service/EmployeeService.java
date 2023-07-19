package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.Employee;
import com.ust.spring.repository.EmployeeRepository;

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
		 Employee employee=null;
		 if(temp.isPresent())
		 {
			 employee=temp.get();
		 }
		 return employee;
	}
	public Employee update(Employee employee) {
		Employee temp = read(employee.getId());
		if(temp!=null)
		{
			temp=employee;
			er.save(temp);
		}
		return temp;
	}
	public Employee delete(Integer id) {
		Employee temp = read(id);
		if(temp!=null)
		{
			er.delete(temp);
		}
		return temp;
	}
	
}
