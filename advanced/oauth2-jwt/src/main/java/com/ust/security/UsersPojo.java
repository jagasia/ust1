package com.ust.security;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "USER_MASTER")
public class UsersPojo {
		@Id
	   private String username;
	   private String password;
	   @Transient
	   private Collection<GrantedAuthority> listOfgrantedAuthorities = new ArrayList<>();
	
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
	public Collection<GrantedAuthority> getListOfgrantedAuthorities() {
		return listOfgrantedAuthorities;
	}
	public void setListOfgrantedAuthorities(Collection<GrantedAuthority> listOfgrantedAuthorities) {
		this.listOfgrantedAuthorities = listOfgrantedAuthorities;
	}
	

}