// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/** 
 * className: RedisConfig<br/>
 * Description: redis缓存配置<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月21日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
//@Configuration
//@EnableCaching
//@PropertySource("classpath:property/redis.properties")
public class RedisConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(environment.getProperty("redis.host"));
		factory.setPort(Integer.parseInt(environment.getProperty("redis.port")));
		return factory;
	}
	
	@Bean
	public RedisTemplate<String, String> redisTemplate() {
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
	
	@Bean
	public CacheManager cacheManager() {
		RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate());
		cacheManager.setDefaultExpiration(3000);
		return cacheManager;
	}
	
}
