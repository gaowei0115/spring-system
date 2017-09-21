// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real;

/** 
 * className: SendMessageService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface SendMessageService {

	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param message
	 */
	void sendMessage(String message);
	
	void sendUserInfo(UserEntity entity);
}
