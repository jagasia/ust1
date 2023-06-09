package com.ust.jag.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String home()
	{
		return "Hello this is working. Thank you";
	}

}
