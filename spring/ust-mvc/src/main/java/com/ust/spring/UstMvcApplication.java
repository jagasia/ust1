package com.ust.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UstMvcApplication {

	@GetMapping
	public String home()
	{
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(UstMvcApplication.class, args);
		System.out.println("MVC");
	}

}
