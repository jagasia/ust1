package com.ust.jag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/album")
public class MyController {
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;
	
	@GetMapping
	public String getDefaultAlbumList() {
	    CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
	    String url = "https://jsonplaceholder.typicode.com/albums";
	    RestTemplate restTemplate=new RestTemplate();
	    return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class));
	}
	
	@GetMapping("/wrong")
	public String getAlbumList()
	{
		 CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
		    String url = "http://localhost:1234/not-real";
		    RestTemplate restTemplate=new RestTemplate();
		    return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class), 
		      throwable -> getDefaultAlbumList());
	}
}
