package com.ust.aop;

import org.springframework.stereotype.Component;

@Component
public class Bank {
	public void withdraw() {
		System.out.println("Withdraw method completed");
	}
	
	public void deposit()
	{
		System.out.println("Deposit method completed");
	}
}
