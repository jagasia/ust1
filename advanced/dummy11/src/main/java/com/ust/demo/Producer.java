package com.ust.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class Producer {

	public void sendMessage() throws JMSException {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Queue queue = new ActiveMQQueue("example.queue");

		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		MessageProducer producer = session.createProducer(queue);

		TextMessage message = session.createTextMessage("Hello, JMS!");
		producer.send(message);

		producer.close();
		session.close();
		connection.close();
	}
}
