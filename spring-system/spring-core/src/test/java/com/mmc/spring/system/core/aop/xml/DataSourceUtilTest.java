// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop.xml;

import org.junit.Test;

/** 
 * className: DataSourceUtilTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DataSourceUtilTest {

	@Test
	public void test() {
		System.out.println(DataSourceUtil.getConnection());
	}
}
