// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.bean.other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * className: PlayerTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlayerConfig.class)
public class PlayerTest {

	@Autowired
	private Player player;
	
	/**
	 * Description：测试不同CompoentScan不同包下是否能扫描到<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 */
	@Test
	public void test() {
		if (player == null) {
			System.out.println("player object is null");
			return;
		}
		player.play();
	}
	
}
