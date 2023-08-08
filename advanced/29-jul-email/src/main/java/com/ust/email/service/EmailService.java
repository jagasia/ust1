package com.ust.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;
	
	public void send(String to, String subject, String body)
	{
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(to);
		msg.setReplyTo("rjagadeeswaran@yahoo.com");
		msg.setSubject(subject);
		msg.setText(body);
		jms.send(msg);
	}
}
