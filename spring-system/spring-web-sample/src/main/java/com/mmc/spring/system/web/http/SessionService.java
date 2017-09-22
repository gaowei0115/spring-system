// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.spring.system.web.utils.RedisUtils;

/** 
 * className: SessionService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月21日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class SessionService {

	private static final Logger logger = LoggerFactory.getLogger(SessionService.class);
	
	@Autowired
	private RedisUtils redisUtils;
	
//	public Map<String, Object> getSession(Strind sid) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//	}
}
