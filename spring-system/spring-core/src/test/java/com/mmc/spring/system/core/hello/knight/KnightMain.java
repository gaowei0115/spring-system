// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.hello.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * ClassName: KnightMain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月7日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class KnightMain {

	public static void main(String[] args) throws QuestException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("knight/knights.xml");
		Knight knight = (Knight) ac.getBean("knight1");
		knight.embarkOnQuest();
	}
}
