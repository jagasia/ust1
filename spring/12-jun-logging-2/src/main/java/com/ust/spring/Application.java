package com.ust.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		System.out.println("Hello world");
		Logger logger = LoggerFactory.getLogger(Application.class);
		logger.error("There is a problem");
	}

}
