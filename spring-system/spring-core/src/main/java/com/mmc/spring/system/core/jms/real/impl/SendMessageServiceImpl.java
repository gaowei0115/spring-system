// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.mmc.spring.system.core.jms.real.SendMessageService;
import com.mmc.spring.system.core.jms.real.UserEntity;

/** 
 * className: SendMessageServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("sendMessageService")
public class SendMessageServiceImpl implements SendMessageService {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.jms.real.SendMessageService#sendMessage(java.lang.String)
	 */
	public void sendMessage(final String message) {
		jmsTemplate.send("send.queue", new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.jms.real.SendMessageService#sendUserInfo(com.mmc.spring.system.core.jms.real.UserEntity)
	 */
	public void sendUserInfo(UserEntity entity) {
		jmsTemplate.convertAndSend(entity);
	}

}
