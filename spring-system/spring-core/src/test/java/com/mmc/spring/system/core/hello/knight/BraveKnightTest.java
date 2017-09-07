// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.hello.knight;

import org.junit.Test;

/** 
 * ClassName: BraveKnightTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月7日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkQuest() throws QuestException {
		Quest quest = new RescueDamselQuest();
		DamselRecuingKnight knight = new DamselRecuingKnight(quest);
		knight.embarkOnQuest();
	}
}
