package com.email.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.demo.service.EmailService;

@RestController
public class MyController {

	@Autowired
	private EmailService es;
	
	@GetMapping
	public String home()
	{
		es.sendSimpleMessage("rjagadeeswaran@yahoo.com", "hii", "Hellooo");
		return "Sent";
	}
}
