// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.base.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mmc.spring.system.web.base.dao.SpittleDao;
import com.mmc.spring.system.web.base.domain.Spittle;

/** 
 * className: SpittleDaoImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Repository("spittleDaoImpl")
public class SpittleDaoImpl implements SpittleDao {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.web.base.dao.SpittleDao#querySpittles(long, int)
	 */
	public List<Spittle> querySpittles(long max, int count) {
		List<Spittle> list = new ArrayList<Spittle>();
		Spittle spittle = new Spittle(100L, "spittle1", new Date(), 20.12, 30.12);
		list.add(spittle);
		spittle = new Spittle(101L, "spittle2", new Date(), 20.12, 30.12);
		list.add(spittle);
		spittle = new Spittle(102L, "spittle3", new Date(), 20.12, 30.12);
		list.add(spittle);
		spittle = new Spittle(103L, "spittle4", new Date(), 20.12, 30.12);
		list.add(spittle);
		spittle = new Spittle(104L, "spittle5", new Date(), 20.12, 30.12);
		list.add(spittle);
		spittle = new Spittle(105L, "spittle6", new Date(), 20.12, 30.12);
		list.add(spittle);
		return list;
	}

}
