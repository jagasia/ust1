package com.email.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;
	
    public void sendSimpleMessage(
    	      String to, String subject, String text) {
    	        
    	        SimpleMailMessage message = new SimpleMailMessage(); 
    	        message.setFrom("jag.javaprogram@gmail.com");
    	        message.setTo(to); 
    	        message.setSubject(subject); 
    	        message.setText(text);
    	        jms.send(message);
    	        
    	    }
}
