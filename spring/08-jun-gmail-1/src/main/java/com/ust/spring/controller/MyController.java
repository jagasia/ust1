package com.ust.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/abcd")
	public String abcd()
	{
		return "Any other url";
	}
	
	@GetMapping("/callback")
	public String home()
	{
		return "Hi welcome to home page";
	}
}
