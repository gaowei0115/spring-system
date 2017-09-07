// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.hello.knight;

/** 
 * ClassName: DamselRecuingKnight<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月7日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class DamselRecuingKnight implements Knight {
	
	private Quest quest;
	
	public DamselRecuingKnight(Quest quest) {
		this.quest = quest;
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.hello.knight.Knight#embarkOnQuest()
	 */
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
