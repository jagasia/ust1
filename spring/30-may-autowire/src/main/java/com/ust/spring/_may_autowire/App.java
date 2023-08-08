package com.ust.spring._may_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        Book book=(Book) ctx.getBean("book");
        System.out.println(book);
    }
}
