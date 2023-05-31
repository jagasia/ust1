package com.ust.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String home()
	{
		return "Hi this is my first restful webservice";
	}
}
