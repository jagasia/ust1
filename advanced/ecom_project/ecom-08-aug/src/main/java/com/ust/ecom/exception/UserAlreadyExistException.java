package com.ust.ecom.exception;

public class UserAlreadyExistException extends RuntimeException
{
	public UserAlreadyExistException(String message)
	{
		super(message);
	}

}
