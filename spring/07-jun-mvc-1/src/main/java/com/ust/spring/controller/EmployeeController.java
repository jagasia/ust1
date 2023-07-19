package com.ust.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ust.spring.api.EmployeeApi;
import com.ust.spring.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeApi api;
	
	@GetMapping
	public String home(ModelMap model)
	{
		List<Employee> employees = api.retrieveEmployees();
		model.addAttribute("employees", employees);
		return "employee";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/emp", params = "btnAdd")
	public String addEmployee(Employee employee, ModelMap model)
	{
		api.addEmployee(employee);
		return home(model);
	}
	
	
	
}
