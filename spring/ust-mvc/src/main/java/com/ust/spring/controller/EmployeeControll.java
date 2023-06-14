package com.ust.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.model.Employee;
import com.ust.spring.model.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeControll {
	@Autowired
	private EmployeeService es;
	
	@GetMapping
	public ModelAndView showEmployeePage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("employee");
		//get all employees
		List<Employee> employees = es.read();
		mv.addObject("employees", employees);
		mv.addObject("employee",new Employee());
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/dml",params = "btnAdd")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee)
	{
		es.create(employee);
		return showEmployeePage();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/dml",params = "btnUpdate")
	public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee)
	{
		es.update(employee);
		return showEmployeePage();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/dml",params = "btnDelete")
	public ModelAndView deleteEmployee(@ModelAttribute("employee") Employee employee)
	{
		es.delete(employee.getId());
		return showEmployeePage();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id") Integer id)
	{
		Employee employee=es.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("employee");
		mv.addObject("employee",employee);
		List<Employee> employees = es.read();
		mv.addObject("employees",employees);
		return mv;
		
	}
	
}
