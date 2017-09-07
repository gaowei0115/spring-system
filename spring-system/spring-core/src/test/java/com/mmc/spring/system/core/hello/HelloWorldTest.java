// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.hello;

import org.junit.Test;

/** 
 * ClassName: HelloWorldTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月7日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello("spring");
	}
}
