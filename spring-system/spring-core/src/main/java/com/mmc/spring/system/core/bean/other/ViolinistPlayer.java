// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.bean.other;

import org.springframework.stereotype.Component;

/** 
 * className: ViolinistPlayer<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Component
public class ViolinistPlayer implements Player{

	
	private Deploy deploy;
	
	public ViolinistPlayer(Deploy deploy) {
		this.deploy = deploy;
	}
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.bean.other.Player#sing()
	 */
	public void sing() {
		System.out.println(" violinist singer ");
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.bean.other.Player#play()
	 */
	public void play() {
		deploy.deploy();
		System.out.println(" violinist player ");
	}

	
}
