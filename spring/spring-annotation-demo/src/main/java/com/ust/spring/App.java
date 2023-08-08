package com.ust.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ctx.scan("com");
//        ctx.refresh();
//        
//        ctx.getBean(Employee.class);
        Employee emp=(Employee) ctx.getBean("emp");
//        emp.setId(20);
//        emp.setName("Jag");
//        emp.setDepartment("Training");
        System.out.println(emp);
    }
}
