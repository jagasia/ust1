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

import com.ust.ecom.entity.Cart;
import com.ust.ecom.entity.User;
import com.ust.ecom.service.CartService;

@RestController
@CrossOrigin("*")
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cs;
	
	@PostMapping
	public Cart create(@RequestBody Cart cart) {
		return cs.create(cart);
	}
	
	@GetMapping
	public List<Cart> read() {
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Cart read(@PathVariable("id") Long id) {
		return cs.read(id);
	}
	
	@PutMapping("/{id}")
	public Cart update(@PathVariable("id") Long id,@RequestBody Cart cart) {
		return cs.update(cart);
	}
	
	@DeleteMapping("/{id}")
	public Cart delete(@PathVariable("id") Long id) {
		return cs.delete(id);
	}
	
	@PostMapping("/user")
	public List<Cart> findCartsByUser(@RequestBody User user)
	{
		return cs.findCartsByUser(user);
	}
}
