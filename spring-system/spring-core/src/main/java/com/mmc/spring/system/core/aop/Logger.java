// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

/** 
 * className: Logger<br/>
 * Description: 模拟logger<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface Logger {

	void debug(String message);
	
	void info(String message);
	
	void error(String message);
}
