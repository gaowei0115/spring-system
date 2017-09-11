// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

import org.springframework.stereotype.Component;

/** 
 * className: PainstPerformer<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Component
public class PainstPerformer implements Performer {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.aop.Performer#perform()
	 */
	public void perform() {
		System.out.println("painst performer....");
	}

}
