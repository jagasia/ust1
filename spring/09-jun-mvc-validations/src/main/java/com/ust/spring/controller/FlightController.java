package com.ust.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.entity.Flight;
import com.ust.spring.service.FlightService;

@Controller
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private FlightService fs;
	
	@GetMapping
	public ModelAndView home(HttpSession session)
	{
		//retrieve all flights from db
		List<Flight> fligths = fs.read();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("flight");
		mv.addObject("flight", new Flight());
		mv.addObject("flights", fligths);
		mv.addObject("username", session.getAttribute("username"));
//		return "flight";		//returns a view
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addFlight", params = "btnAdd")
	public ModelAndView addFlight(@Valid Flight flight, BindingResult br, HttpSession session)
	{
		if(!br.hasErrors())
		{
			System.out.println("No errors");
			fs.create(flight);
		}
		else
		{
			System.out.println("There are errors");
			System.out.println(flight);
			//there are errors, so go back to same page with same modelattribute
			List<Flight> fligths = fs.read();
			ModelAndView mv=new ModelAndView();
			mv.setViewName("flight");
			mv.addObject("flight", flight);
			mv.addObject("flights", fligths);	
			return mv;
		}
		
		return home(session);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addFlight", params = "btnUpdate")
	public ModelAndView updateFlight(@ModelAttribute("flight") Flight flight, HttpSession session)
	{
		fs.update(flight);
		return home(session);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addFlight", params = "btnDelete")
	public ModelAndView deleteFlight(@ModelAttribute("flight") Flight flight, HttpSession session)
	{
		fs.delete(flight.getId());
		return home(session);
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id")Integer id)
	{
		Flight flight = fs.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("flight");
		mv.addObject("flight",flight);
		List<Flight> fligths = fs.read();
		mv.addObject("flights",fligths);
		return mv;
		
		
	}
}
