// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.bean.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mmc.spring.system.core.bean.other.Player;

/** 
 * className: SgtPeppers<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Component("SgtPeppers")
public class SgtPeppers implements CompactDisc {

	private Player player;
	
//	@Autowired
//	public SgtPeppers(Player player) {
//		this.player = player;
//	}
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.bean.cd.CompactDisc#play()
	 */
	public void play() {
		System.out.println("sgtpeeppers play ....");
		
		player.play();
		player.sing();
	}
	
	@Autowired
	public void setPlayer(Player player) {
		this.player = player;
	} 

}
