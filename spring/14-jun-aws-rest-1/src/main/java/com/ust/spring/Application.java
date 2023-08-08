package com.ust.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("hi")
	public String home()
	{
		return "Jag: hi welcome to home. You are able to see from aws server";
	}
	
	@GetMapping("hello")
	public String hello()
	{
		return "Hello world from Jag...";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
