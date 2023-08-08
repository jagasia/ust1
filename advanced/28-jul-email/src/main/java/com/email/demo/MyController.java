package com.email.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private EmailServiceImpl email;
	
	@GetMapping
	public String sendEmail()
	{
		email.sendSimpleMessage("rjagadeeswaran@yahoo.com", "hi...", "Hello world from spring email");
		
		return "Sent";
	}
}
