// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml;

import java.util.HashMap;
import java.util.Map;

/** 
 * className: AccountServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class AccountServiceImpl implements AccountService {

	
	private AccountDao accountDao;
	
	
	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.xml.AccountService#transferMoney(java.lang.String, java.lang.String, java.lang.Long)
	 */
	public void transferMoney(String accoutFrom, String accountTo, Long money) {
		System.out.println(accoutFrom + " transfer money to " + accountTo + " money : " + money.longValue());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("accountFrom", accoutFrom);
		params.put("accountTo", accountTo);
		params.put("money", money);
		accountDao.transferMoney(params);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
}
