// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

import org.springframework.stereotype.Service;

/** 
 * className: DownloadService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("downloadService")
public class DownloadService {

	private static Logger logger = ServiceLogger.log;
	
	public void exeDown() {
		logger.debug(" download .......");
	}
}
