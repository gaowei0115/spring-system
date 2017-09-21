// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real;

/** 
 * className: ReceiveMessageService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface ReceiveMessageService {

	String receiveMessage();
	
	UserEntity receiveUserInfo();
}
