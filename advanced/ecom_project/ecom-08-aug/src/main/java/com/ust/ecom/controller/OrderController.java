package com.ust.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ecom.entity.Order;
import com.ust.ecom.entity.Product;
import com.ust.ecom.entity.User;
import com.ust.ecom.service.OrderService;

@RestController
@CrossOrigin("*")
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService ps;
	
	@PostMapping
	public Order create(@RequestBody Order order) {
		return ps.create(order);
	}
	
	@GetMapping
	public List<Order> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Order read(@PathVariable("id") Long id) {
		return ps.read(id);
	}
	
	@PutMapping("/{id}")
	public Order update(@PathVariable("id") Long id,@RequestBody Order order) {
		return ps.update(order);
	}
	
	@DeleteMapping("/{id}")
	public Order delete(@PathVariable("id") Long id) {
		return ps.delete(id);
	}
	
	@PostMapping("/user")
	public List<Order> findOrdersByUser(@RequestBody User user)
	{
		return ps.findOrdersByUser(user);
	}
	

	@PostMapping("/product")
	public List<Order> findOrdersByProduct(@RequestBody Product product)
	{
		return ps.findOrdersByProduct(product);
	}
	
	@GetMapping("/generate")
	public Long generateOrderId()
	{
		return ps.generateOrderId();
	}
		
}