package com.ust.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.scan("com");
        ctx.refresh();
        Car car=(Car) ctx.getBean("car");
        car.play();
    }
}
