package com.ust.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {
	
	@GetMapping("/hi")
	public String home()
	{
		return "Hello world. Sales api is running";
	}
		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
