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
		return "Hi this rest api was created during 13-Jun 12 noon";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
