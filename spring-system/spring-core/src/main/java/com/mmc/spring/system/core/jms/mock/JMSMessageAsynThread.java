// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.mock;

import javax.jms.Message;

/** 
 * className: JMSMessageAsynThread<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class JMSMessageAsynThread implements Runnable {

	private final Message message;
	
	/**
	 * @param message
	 */
	public JMSMessageAsynThread(Message message) {
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		System.out.println("asyn deal message... start");
		System.out.println("Get message content : " + message);
		System.out.println("asyn deal message... end");
	}

}

