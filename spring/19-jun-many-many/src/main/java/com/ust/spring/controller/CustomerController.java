package com.ust.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.Customer;
import com.ust.spring.repository.CustomerRepository;

class CustomerAlreadyExistException extends RuntimeException
{
	public CustomerAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository pr;

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		if(customer.getId()==null)
		{
			return pr.save(customer);
		}
		Customer temp=findCustomerById(customer.getId());
		if(temp==null)
		{
			pr.save(customer);
		}else
		{
			throw new CustomerAlreadyExistException("Customer with ID:"+customer.getId()+" Already exist");
		}
		return customer;
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id")Integer id) {
		Optional<Customer> temp=pr.findById(id);
		Customer customer=null;
		if(temp.isPresent())
		{
			customer=temp.get();
		}
		return customer;		
	}
	
	@GetMapping
	public List<Customer> retrieveAllCustomers() {
		return pr.findAll();
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable("id") Integer id,@RequestBody Customer customer) {
		Customer existing = findCustomerById(id);
		if(existing!=null)
		{
			existing=customer;
			pr.save(existing);
		}
		return existing;
	}
	
	@DeleteMapping("/{id}")
	public Customer delete(@PathVariable("id") Integer id) {
		Customer temp=findCustomerById(id);
		if(temp!=null)
		{
			pr.delete(temp);
		}
		return temp;
	}
	
	
	
}
