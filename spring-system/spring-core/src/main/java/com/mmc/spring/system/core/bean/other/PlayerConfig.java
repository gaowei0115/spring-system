// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.bean.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * className: PlayerConfig<br/>
 * Description: 通过java config形式配置bean依赖关系<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Configuration
@ComponentScan
public class PlayerConfig {

	@Bean
	public Deploy violinistDeploy() {
		return new ViolinistDeploy();
	}
	
	@Bean
	public Player violinistPlayer(){
		return new ViolinistPlayer(violinistDeploy());
	}
}
