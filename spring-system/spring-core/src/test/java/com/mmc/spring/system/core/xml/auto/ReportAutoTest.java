// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml.auto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: ReportAutoTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ReportAutoTest {

	@Autowired
	@Qualifier("reportQueryServiceImpl")
	private ReportService reportService;
	
	@Test
	public void test() {
		reportService.statisticsReport();
	}
	
	@Test
	public void test02() {
		reportService.statisticsReport();
	}
}
