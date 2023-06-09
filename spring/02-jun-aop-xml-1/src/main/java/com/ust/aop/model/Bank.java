package com.ust.aop.model;

public class Bank {
	public void withdraw()
	{
		System.out.println("withdraw: Remember to collect the cash");
	}
	
	public void deposit()
	{
		System.out.println("deposit: Thank you for banking with us.");
	}
}
