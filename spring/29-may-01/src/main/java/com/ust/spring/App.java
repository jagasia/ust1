package com.ust.spring;

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
        //how to get an instance of bean???????
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Mathematics maths= (Mathematics) ctx.getBean("maths");
//        maths.setNo1(20);
//        maths.setNo2(30);
        System.out.println(maths.sum());
        
//        ctx.getBean("car1");
        Car car1 = ctx.getBean(Car.class);
        car1.play();
        
        Jbl jbl=(Jbl) ctx.getBean("jbl");
        car1.setAudio(jbl);
        car1.play();
        
    }
}
