// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.mock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/** 
 * className: JMSConnectionManager<br/>
 * Description: 消息管理<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class JMSConnectionManager {

	private static final ConnectionFactory connectionFactory;
	private static Connection connection;
	// 异步执行线程池
	private static final ExecutorService executor = Executors.newCachedThreadPool();
	
	private static final String userName = "admin";
	private static final String password = "admin";
	private static final String brokerURL = "tcp://localhost:61616";
	private static AtomicInteger connectionIncr = new AtomicInteger(0);
	
	static {
		connectionFactory = new ActiveMQConnectionFactory(userName, password, brokerURL);
		System.out.println("connection factory info [userName:" + userName + ", password:" + password + ", brokerURL:" + brokerURL + "]");
	}
	
	/**
	 * Description：获取连接对象<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @return
	 */
	public static Connection getConnection() {
		System.out.println("connection start....");
		try {
			while (connection == null) {
				connection = connectionFactory.createConnection();
				if (connection != null) {
					connectionIncr.set(0);
					break;
				}
				if (connectionIncr.incrementAndGet() >= 10) {
					connectionIncr.set(0);
					break;
				}
			}
			System.out.println("jms connection success  [ " + connection + " ]");
			connection.start();
		} catch (JMSException e) {
			System.out.println("JMS Server start fauil....");
			System.out.println("JMS get connection retry " + connectionIncr.get() + "次数");
			System.out.println(e.getMessage());
		}
		return connection;
	}
	
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param message
	 * @throws JMSException 
	 */
	public static void sendMessage(String message, String queue) throws JMSException {
		Session session = null;
		Queue destination = null;
		MessageProducer producer = null;
		try {
			connection = getConnection();
			session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			if (session != null) {
				destination = session.createQueue(queue);
				// 创建生产者
				producer = session.createProducer(destination);
				TextMessage textMessage = session.createTextMessage(message);
				producer.send(textMessage);
				// 提交会话
//				session.commit();
			}
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (session != null) {
				session.close();
			}
			if (producer != null) {
				producer.close();
			}
		}
	}
	
	/**
	 * Description：同步接收消息<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param queue
	 * @return
	 */
	public static Message recevieSynMessage(String queue) {
		Session session = null;
		MessageConsumer consumer = null;
		try {
			connection = getConnection();
			session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			Queue destination = session.createQueue(queue);
			consumer = session.createConsumer(destination);
			Message message = consumer.receive();
			System.out.println("receive message " + message);
			return message;
		} catch (JMSException e) {
			System.out.println("receive message exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (session != null) {
					session.close();
				}
				if (consumer != null) {
					consumer.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	/**
	 * Description：异步接收消息<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param queue
	 * @return
	 */
	public static void recevieAsynMessage(String queue) {
		Session session = null;
		MessageConsumer consumer = null;
		try {
			connection = getConnection();
			session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			Queue destination = session.createQueue(queue);
			consumer = session.createConsumer(destination);
			Message message = consumer.receive();
			consumer.setMessageListener(new MessageListener() {
				public void onMessage(Message message) {
					executor.execute(new JMSMessageAsynThread(message));
				}
			});
			System.out.println("receive message " + message);
		} catch (JMSException e) {
			System.out.println("receive message exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (session != null) {
					session.close();
				}
				if (consumer != null) {
					consumer.close();
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
