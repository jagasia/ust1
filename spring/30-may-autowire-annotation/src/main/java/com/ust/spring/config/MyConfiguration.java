package com.ust.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ust.spring.bean.Author;

@Configuration
@ComponentScan(basePackages = {"com","com.ust"})
public class MyConfiguration {

	@Bean
	public Author author2()
	{
		return new Author(22, "Abdul Kalam", "APJ");
	}
}
