// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.hello;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * className: HelloBaseTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@Configuration("classpath:knight/knights.xml")
public class HelloBaseTest {

	protected ApplicationContext ac;
	
	@Before
	public void setUp() {
		ac = new ClassPathXmlApplicationContext("knight/knights.xml");
	}
}
