package com.ust.jag;

public class Aut {
	
	public boolean login(String username, String password)
	{
		System.out.println("Aut original method");
		return (username.equals(password)?false:true);
	}
}
