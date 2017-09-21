// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.mock;

import javax.jms.JMSException;
import javax.jms.Message;

import org.junit.Test;

/** 
 * className: JMSConnectionManagerTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class JMSConnectionManagerTest {

	@Test
	public void testConnection() {
		System.out.println(JMSConnectionManager.getConnection());
	}
	
	@Test
	public void testsendMessage() throws JMSException {
		JMSConnectionManager.sendMessage("testing jms send test04", "test04");
	}
	
	@Test
	public void testreceiveMessage() throws JMSException {
		Message message = JMSConnectionManager.recevieSynMessage("test04");
		System.out.println(message.getJMSMessageID());
		System.out.println(message.toString());
	}
	
	@Test
	public void testAsynReceiveMessage() {
		JMSConnectionManager.recevieAsynMessage("test04");
	}
}
