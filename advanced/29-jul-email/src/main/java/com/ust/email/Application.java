package com.ust.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.email.service.EmailService;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
	private EmailService es;
	
	@GetMapping
	public String sendEmail()
	{
		es.send("rjagadeeswaran@yahoo.com", "hi", "THis is sent from java progtram,,,,");
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
