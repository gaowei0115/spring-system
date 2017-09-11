// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/** 
 * className: ServiceLogger<br/>
 * Description: 配置日志环绕通知<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Aspect
@Component
public class ServiceLogger {
	
	public static final Logger log = LoggerFactory.getLogger(ServiceLogger.class);

	@Around("execution(* com.mmc.spring.system.core.aop.*.*(..))")
	public void debugLogger(ProceedingJoinPoint pjd) {
		try {
			log.debug("business start ...");
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			pjd.proceed();
			long end = System.currentTimeMillis();
			log.debug("business end ... [cost time " + (end - start) + "ms]");
		} catch (Exception e) {
			log.debug(e.getMessage());
		} catch (Throwable e) {
			log.debug(e.getMessage());
		}
	}
}
