package com.ust.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ecom.entity.User;
import com.ust.ecom.exception.UserAlreadyExistException;
import com.ust.ecom.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository ur;
	
	public User create(User user) {
		
		User temp = null;
		if(user.getId()!=null)
			temp=read(user.getId());
		if(temp!=null)
		{
			//user already exists
			throw new UserAlreadyExistException("There is already an user with id: "+user.getId());
		}		
		return ur.save(user);
	}
	public List<User> read() {
		return ur.findAll();
	}
	public User read(Long id) {
		Optional<User> temp = ur.findById(id);
		User user=null;
		if(temp!=null)
		{
			user=temp.get();
		}
		return user;
	}
	public User update(User user) {
		User temp = read(user.getId());
		if(temp!=null)
		{
			temp=user;
			ur.save(temp);
		}
		return temp;
	}
	public User delete(Long id) {
		User user=read(id);
		if(user!=null)
		{
			ur.delete(user);
		}
		return user;
	}
	

}
