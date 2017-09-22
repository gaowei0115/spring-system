// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.utils;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/** 
 * className: RedisUtils<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月21日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class RedisUtils {

	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param key
	 * @param value
	 */
	public void set(String key, String value) {
		redisTemplate.opsForValue().set(key, value);
	}
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param key
	 * @return
	 */
	public String get(String key) {
		return (String) redisTemplate.opsForValue().get(key);
	}
	
	/**
	 * Description：设置超时<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param key
	 * @param expireTime
	 */
	public void setExpire(String key, Long expireTime) {
		redisTemplate.boundValueOps(key).expire(expireTime, TimeUnit.SECONDS);
	}
	
}
