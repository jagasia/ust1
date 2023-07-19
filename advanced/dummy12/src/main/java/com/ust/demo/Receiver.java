package com.ust.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class Receiver {

	public void receive() throws JMSException {

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Queue queue = new ActiveMQQueue("example.queue");

		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		MessageConsumer consumer = session.createConsumer(queue);

		TextMessage receivedMessage = (TextMessage) consumer.receive();
		System.out.println("Received message: " + receivedMessage.getText());

		consumer.close();
		session.close();
		connection.close();
	}
}
