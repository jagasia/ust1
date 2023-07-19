package com.ust.aop;

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
        
//        Bank bank = (Bank) ctx.getBean("bank");
        Bank bank=ctx.getBean(Bank.class);
        
        bank.withdraw();
        
        System.out.println("................");
        bank.deposit();
    }
}
