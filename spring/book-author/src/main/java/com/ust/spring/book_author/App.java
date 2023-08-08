package com.ust.spring.book_author;

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
        Book b1= (Book) ctx.getBean("book");
        Book b2= (Book) ctx.getBean("book");
        b2.setTitle("I dont know");
        System.out.println(b1);
        System.out.println(b2);
        
    }
}
