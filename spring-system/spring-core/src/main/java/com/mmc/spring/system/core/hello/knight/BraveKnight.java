// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.hello.knight;

/** 
 * ClassName: BraveKnight<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月7日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class BraveKnight implements Knight {

	private Quest quest;
//	private Minstrel minstrel;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
//		this.minstrel = minstrel;
	}
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.hello.knight.Knight#embarkOnQuest()
	 */
	public void embarkOnQuest() throws QuestException {
//		minstrel.singBeforeQuest();
		this.quest.embark();
//		minstrel.singAfterQuest();
	}

}
