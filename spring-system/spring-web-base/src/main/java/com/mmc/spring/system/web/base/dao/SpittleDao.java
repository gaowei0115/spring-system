// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.base.dao;

import java.util.List;

import com.mmc.spring.system.web.base.domain.Spittle;

/** 
 * className: SpittleDao<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface SpittleDao {

	List<Spittle> querySpittles(long max, int count);
	
}
