package com.ust.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.entity.Flight;
import com.ust.spring.entity.User;
import com.ust.spring.service.FlightService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private FlightService fs;
	
	@GetMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@PostMapping("/validateLogin")
	public ModelAndView validateLogin(User user, HttpSession session)
	{
		ModelAndView mv=new ModelAndView();
		if(user.getUsername().equals("raja") && user.getPassword().equals("ravi"))
		{
			//success, store the user name in session
			session.setAttribute("username", user.getUsername());
			List<Flight> fligths = fs.read();
			
			mv.setViewName("flight");
			mv.addObject("flight", new Flight());
			mv.addObject("flights", fligths);
		}
		else
		{
			//failure. go back to login page and display error message
			mv.setViewName("login");
			mv.addObject("message", "Login failed. Try again");
		}
		return mv;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "logout";
	}
}
