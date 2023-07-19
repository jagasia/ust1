package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@GetMapping
	public String hello()
	{
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Employee> emp = rt.getForEntity("http://localhost:8081/employee/1", Employee.class);
		
		return "hello world "+emp.getBody();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
