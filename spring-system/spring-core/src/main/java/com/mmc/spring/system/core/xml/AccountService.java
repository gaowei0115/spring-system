// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml;

/** 
 * className: AccountService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface AccountService {

	/**
	 * Description：模拟账户转账操作<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param accoutFrom
	 * @param accountTo
	 * @param money
	 */
	void transferMoney(String accoutFrom, String accountTo, Long money);
}
