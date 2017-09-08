// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/** 
 * className: DataSourceConfig<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Configuration
public class DataSourceConfig {

	@Bean
	@Profile("dev")
	public DataSource oracleDataSource() {
		return new OracleDataSource();
	}
	
	@Bean
	@Profile("prod")
	public DataSource mySqlDataSource() {
		return new MysqlDataSource();
	}
}
