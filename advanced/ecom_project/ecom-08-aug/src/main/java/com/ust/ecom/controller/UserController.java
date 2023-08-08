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

import com.ust.ecom.entity.User;
import com.ust.ecom.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@PostMapping
	public User create(@RequestBody User user) {
		return us.create(user);
	}
	
	@GetMapping
	public List<User> read() {
		return us.read();
	}
	
	@GetMapping("/{id}")
	public User read(@PathVariable("id") Long id) {
		return us.read(id);
	}
	
	@PutMapping("/{id}")
	public User update(@PathVariable("id") Long id,@RequestBody User user) {
		return us.update(user);
	}
	
	@DeleteMapping("/{id}")
	public User delete(@PathVariable("id") Long id) {
		return us.delete(id);
	}
	
}
