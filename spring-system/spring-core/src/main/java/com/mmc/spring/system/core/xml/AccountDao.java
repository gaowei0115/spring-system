// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml;

import java.util.Map;

/** 
 * className: AccountDao<br/>
 * Description: 模拟账户转账DAO层<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface AccountDao {

	void transferMoney(Map<String, Object> params);
	
}
