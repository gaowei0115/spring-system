// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.hello.aware;

import org.junit.Test;

import com.mmc.spring.system.core.hello.HelloBaseTest;

/** 
 * className: AutoBeanTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class AutoBeanTest extends HelloBaseTest{

	@Test
	public void test() throws InterruptedException {
		AutoBeanAware autoBeanAware = ac.getBean(AutoBeanAware.class);
		autoBeanAware.executor();
		autoBeanAware = null;
		Thread.sleep(1000);
	}
	
}
