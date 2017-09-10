// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * ClassName: SystemConfig<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月8日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SystemConfigTest {

	@Autowired
	private SystemConfig systemConfig;
	
	@Test
	public void test() {
		System.out.println(systemConfig.getName());
		System.out.println(systemConfig.getPassword());
	}
}
