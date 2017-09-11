// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * className: MockLogger<br/>
 * Description: 模拟日志<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class MockLogger implements Logger {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final Class<?> clazz;
	
	public MockLogger(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.aop.Logger#debug(java.lang.String)
	 */
	public void debug(String message) {
		System.out.println(getPrint(LoggerLevel.DEBUG.getLevel()) + message);
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.aop.Logger#info(java.lang.String)
	 */
	public void info(String message) {
		System.out.println(getPrint(LoggerLevel.INFO.getLevel()) + message);
	}

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.aop.Logger#error(java.lang.String)
	 */
	public void error(String message) {
		System.err.println(getPrint(LoggerLevel.ERROR.getLevel()) + message);
	}
	
	private String getPrint(String level){
		return "[spring-core] - " + sdf.format(new Date()) + " - " + "[" + level + "] " + this.clazz.getName() + " :";
	}
	
	enum LoggerLevel{
		DEBUG("1", "DEBUG"),
		INFO("2", "INFO"),
		ERROR("3", "ERROR");
		
		private String code;
		private String level;
		
		private LoggerLevel(String codeInit, String levelInit) {
			this.code = codeInit;
			this.level = levelInit;
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the level
		 */
		public String getLevel() {
			return level;
		}

		/**
		 * @param level the level to set
		 */
		public void setLevel(String level) {
			this.level = level;
		}
	}

}
