// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/** 
 * className: TranscationManager<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class TranscationManager {

	public void transaction(ProceedingJoinPoint pdj) {
		try {
			System.out.println("开启事务.....");
			pdj.proceed();
			System.out.println("事务提交.....");
		} catch (Throwable e) {
			System.out.println("操作异常：" + e.getMessage());
			System.out.println("事务回滚.....");
		}
	}
	
}
