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

import com.ust.ecom.entity.AuthRequest;
import com.ust.ecom.entity.User;
import com.ust.ecom.service.UserService;
import com.ust.ecom.util.JwtUtil;
import com.ust.ecom.util.Token;


@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/validate")
	public Token validateLogin(@RequestBody AuthRequest ar)
	{
		System.out.println(ar);
		User user = us.read(ar.getId());
		if(user!=null)
		{
			//there is an user with this id. now check if pwds match
			if(user.getPassword().equals(ar.getPassword()))
			{
				//login is successfull
				Token token=new Token();
				token.setUser(user);
				String jwt = jwtUtil.generateToken(String.valueOf(user.getId()));
				token.setJwt(jwt);
				return token;
			}else
			{
				//failed
				return null;
			}
		}else
		{
			//failed
			return null;
		}
	}
	
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
