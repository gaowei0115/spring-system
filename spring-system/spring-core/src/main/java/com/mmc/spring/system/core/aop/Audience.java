// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/** 
 * ClassName: Audience<br/>
 * Description: 观众切面<br/>
 * Author: GW<br/>
 * Create： 2017年9月10日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
@Aspect
public class Audience {

	@Pointcut("execution(** com.mmc.spring.system.core.aop.perform(..))")
	public void performance() {
		
	}
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("silencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("take seats");
	}
	
	@After("performance()")
	public void applause() {
		System.out.println("CLAP  CLAP  CLAP !!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("demand a refund ");
	}
	
}
