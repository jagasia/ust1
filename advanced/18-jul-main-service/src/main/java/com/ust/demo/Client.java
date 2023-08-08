package com.ust.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Client {
	@Autowired
	private LoadBalancerClient loadBalancer;

	public Employee accessEmployeeService() {
		String url = "/employee/13";
		ServiceInstance serviceInstance = loadBalancer.choose("app-producer");

		System.out.println(serviceInstance.getUri());

		String baseUrl = serviceInstance.getUri().toString() + url;

		System.out.println(baseUrl);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Employee> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), Employee.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return response.getBody();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
