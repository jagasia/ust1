package com.ust.demo;

import javax.jms.JMSException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JMSException
    {
    	Receiver r=new Receiver();
    	  r.receive();
    	
        System.out.println( "Hello World!" );
    }
}
