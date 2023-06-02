package com.ust.aop.aspect;

public class RBIAspect {
	public void validatePin() {
		System.out.println("Pin number is validated...");
	}
	
	public void checkBalance()
	{
		System.out.println("Balance is checked and sufficient funds available");
	}
	
	public void printReceipt()
	{
		System.out.println("Receipt is printed...");
	}
}
