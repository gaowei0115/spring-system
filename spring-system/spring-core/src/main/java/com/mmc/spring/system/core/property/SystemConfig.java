// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * ClassName: SystemConfig<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月8日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
@Component
public class SystemConfig {

	private String name;
	private String password;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@Value("#{system['system.name']}")
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	@Value("#{system['system.password']}")
	public void setPassword(String password) {
		this.password = password;
	}
	
}
