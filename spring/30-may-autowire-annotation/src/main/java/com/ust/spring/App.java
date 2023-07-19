package com.ust.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.spring.bean.Book;
import com.ust.spring.config.MyConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
        Book book = ctx.getBean(Book.class);
        System.out.println(book);
    }
}
