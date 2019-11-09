package br.inatel.dm110.ibge.beans;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import br.inatel.dm110.api.StateTO;

@Stateless
public class IbgeMessageSender {
	@Resource(lookup = "java:/ConnectionFactory")
	private ConnectionFactory connectionFactory;
	@Resource(lookup = "java:/jms/queue/dm110statequeue") //Será configurado no container
	private Queue queue;
	
	public void sendObjectMessage(StateTO object) {
		try (Connection connection = connectionFactory.createConnection();
				Session session = connection.createSession();
				MessageProducer producer = session.createProducer(queue);) {
			ObjectMessage objMessage = session.createObjectMessage(object);
			producer.send(objMessage);
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

//	public void sendTextMessage(String text) {
//		try (Connection connection = connectionFactory.createConnection();
//				Session session = connection.createSession();
//				MessageProducer producer = session.createProducer(queue);) {
//			TextMessage textMessage = session.createTextMessage(text);
//			producer.send(textMessage);
//		} catch (JMSException e) {
//			throw new RuntimeException(e);
//		}
//	}
}
