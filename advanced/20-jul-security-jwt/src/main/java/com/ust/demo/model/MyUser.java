package com.ust.demo.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.userdetails.User;

@Entity
public class MyUser extends User
{
	@Id
	private String username;
	private String password;
	public MyUser() {
		super("jag","jag",new ArrayList<>());
	}
	public MyUser(String username, String password) {
		this();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + "]";
	}
	
}
