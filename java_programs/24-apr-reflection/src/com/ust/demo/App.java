package com.ust.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class App {

	public static void main(String[] args) {
		Employee raja=new Employee();
		Class c = raja.getClass();
		Method[] methods = c.getDeclaredMethods(); //c.getMethods();
		
		for(Method method:methods)
		{
			if(!Modifier.isPublic(method.getModifiers()))
				System.out.println(method.getName());
		}
	}

}
