package com.ust.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com"})
public class MyConfiguration {

	@Bean
	public Employee emp()
	{
		return new Employee(2, "Dinesh", "MCA");
	}
}
