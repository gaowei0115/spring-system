// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

/** 
 * className: LoggerFactory<br/>
 * Description: 模拟日志工厂类<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class LoggerFactory {

	private static Logger logger;
	
	public static synchronized Logger getLogger(Class<?> clazz) {
		logger = new MockLogger(clazz);
		return logger;
	}
}
