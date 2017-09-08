// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * className: XmlConfigBeanTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class XmlConfigBeanTest {

	private ApplicationContext ac;
	
	@Before
	public void setUp() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void test01() {
		AccountService accountService = (AccountService) ac.getBean("accountService");
		accountService.transferMoney("zhangsan", "lisi", 100L);
	}
}
