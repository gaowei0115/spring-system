// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real.impl;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.mmc.spring.system.core.jms.real.ReceiveMessageService;
import com.mmc.spring.system.core.jms.real.UserEntity;

/** 
 * className: ReceiveMessageServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("receiveMessageService")
public class ReceiveMessageServiceImpl implements ReceiveMessageService {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.jms.real.ReceiveMessageService#receiveMessage()
	 */
	public String receiveMessage() {
		ObjectMessage objectMessage = (ObjectMessage) jmsTemplate.receiveAndConvert();
		try {
			return (String)objectMessage.getObject();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.jms.real.ReceiveMessageService#receiveUserInfo()
	 */
	public UserEntity receiveUserInfo() {
		try {
			return (UserEntity)jmsTemplate.receiveAndConvert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
