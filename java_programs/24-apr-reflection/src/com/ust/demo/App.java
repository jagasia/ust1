package com.ust.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class App {

	public static void main(String[] args) {
		Employee raja=new Employee();
		raja.takeLeave();
		
		Class c = raja.getClass();
		Constructor[] cons = c.getConstructors();
		for(Constructor con:cons)
		{
			Annotation[] ans = con.getAnnotations();
			System.out.println("The constructor has following annotations:");
			for(Annotation a:ans)
			{
				System.out.println(a);
			}
		}
		Method[] methods = c.getDeclaredMethods(); //c.getMethods();
		
		for(Method method:methods)
		{
			System.out.println("The method: "+method.getName()+" has following annotations:");
			for(Annotation a:method.getAnnotations())
			{
				System.out.println("\t"+a);
			}
//			if(!Modifier.isPublic(method.getModifiers()))
//				System.out.println(method.getName());
		}
	}

}
