// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/** 
 * className: ScopeBeanConfig<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Configuration
public class ScopeBeanConfig {

	@Bean
	@Scope("prototype")
	public ScopeBean scopeBean() {
		return new ScopeBean();
	}
}
