package com.ust.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpHeaders;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RequestMapping("/main")
public class Application {
	@Autowired
	private Client client;
	
	@RequestMapping(value="/process", method = RequestMethod.GET)
    public Employee  showLoginPage(ModelMap model) throws RestClientException, IOException{
        return client.accessEmployeeService();
    }

	
//	@Autowired
//	private RestTemplate rt;
//	
	
	@GetMapping
	public String home()
	{
		//access the employee service and find employee by id
		//http://localhost:8383/employee/13
//		RestTemplate rt=new RestTemplate();
//		ResponseEntity<Employee> entity=new ResponseEntity<>(HttpStatus.OK);
//		ResponseEntity<Employee[]> response = 
//				rt.exchange("http://localhost:8383/employee", HttpMethod.GET, null, Employee[].class);
//
////		List<Employee> x = rt.getForObject("http://localhost:8383/employee", List.class);
//		Employee[] list = response.getBody();
//		System.out.println("hi:"+response.getBody()[0]);
//		ResponseEntity<Employee> result = rt.getForEntity("http://localhost:8383/employee/13", Employee.class);
//		return "Hello worldd: "+result.getBody().getName();
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
