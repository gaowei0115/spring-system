// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * ClassName: ScopeServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月8日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ScopeServiceTest {

	@Autowired
	private ScopeService scopeService;
	@Autowired
	private ScopeService scopeService2;
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentService studentService2;
	
	@Test
	public void test() {
		System.out.println(scopeService);
		System.out.println(scopeService2);
	}
	
	@Test
	public void test01() {
		System.out.println(studentService);
		System.out.println(studentService2);
	}
}
