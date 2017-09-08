// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml;

import java.util.Map;

/** 
 * className: AccountDaoImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class AccountDaoImpl implements AccountDao {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.xml.AccountDao#transferMoney(java.util.Map)
	 */
	public void transferMoney(Map<String, Object> params) {
		System.out.println("数据持久化数据库...");
		for (String key : params.keySet()) {
			System.out.println("key : " + key + ", value : " + params.get(key));
		}
	}

}
