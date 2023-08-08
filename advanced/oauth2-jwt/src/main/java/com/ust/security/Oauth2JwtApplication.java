package com.ust.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class Oauth2JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2JwtApplication.class, args);
		System.out.println("hello worlld");
	}

}
