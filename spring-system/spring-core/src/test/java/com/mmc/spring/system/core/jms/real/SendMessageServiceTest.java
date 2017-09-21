// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: SendMessageServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SendMessageServiceTest {

	@Autowired
	private SendMessageService sendMessageService;
	
	@Test
	public void test01() {
		sendMessageService.sendMessage("hello spring jms message");
	}
	
	@Test
	public void test02() {
		UserEntity entity = new UserEntity();
		entity.setId(901001L);
		entity.setUsername("李四");
		entity.setPassword("123456");
		entity.setBirthday(new Date());
		sendMessageService.sendUserInfo(entity);
	}
}
