package com.ust.demo;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Employee raja=new Employee();
		Class<? extends Employee> c = raja.getClass();
		Method[] methods = c.getDeclaredMethods(); //c.getMethods();
		for(Method method:methods)
		{
			System.out.println(method.getName());
		}
	}

}
