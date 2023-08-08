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
    	Producer p=new Producer();
    	p.sendMessage();
        System.out.println( "Hello World!" );
    }
}
