// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop.xml;

import org.springframework.stereotype.Repository;

/** 
 * className: UserDaoImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Repository
public class UserDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.aop.xml.UserDao#insert()
	 */
	public void insert() {
		System.out.println("执行插入操作....");
	}

}
