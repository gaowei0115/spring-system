// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: ScopeBeanTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ScopeBeanTest {

	@Autowired
	private ScopeBean scopeBean;
	@Autowired
	private ScopeBean scopeBean2;
	
	@Autowired
	private StudentBean studentBean;
	@Autowired
	private StudentBean studentBean2;
	
	@Test
	public void test() {
		System.out.println(scopeBean);
		System.out.println(scopeBean2);
	}
	
	@Test
	public void test01() {
		System.out.println(studentBean);
		System.out.println(studentBean2);
	}
}
