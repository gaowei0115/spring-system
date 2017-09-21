// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.test.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.mmc.spring.system.test.BaseTest;

/** 
 * className: RedisTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月21日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class RedisTest extends BaseTest {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Test
	public void test() {
		redisTemplate.opsForValue().set("111", "2222");
	}
	
	@Test
	public void test01() {
		String value = redisTemplate.opsForValue().get("111");
		System.out.println(value);
	}
}
