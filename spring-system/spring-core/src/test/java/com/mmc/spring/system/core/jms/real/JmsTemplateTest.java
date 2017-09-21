// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.jms.real;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: JmsTemplateTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月20日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class JmsTemplateTest {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Test
	public void test01() {
		System.out.println(jmsTemplate);
	}
}
