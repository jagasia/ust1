package com.ust.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/jag")
public class Application {
	
	
	
	@GetMapping
	public String home()
	{
		return "Hi welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LoggerFactory.getLogger(Application.class);
		logger.info("THis is info");
		logger.warn("This is warning");
		logger.error("This is error");
	}

}
