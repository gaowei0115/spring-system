// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: AudienceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AudienceConfig.class)
public class AudienceJavaConfigTest {

	@Autowired
	private Performer performer;
	
	@Test
	public void test() {
		performer.perform();
	}
	
}
