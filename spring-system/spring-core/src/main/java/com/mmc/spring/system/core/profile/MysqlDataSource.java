// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.profile;

/** 
 * className: MysqlDataSource<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class MysqlDataSource implements DataSource{

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.profile.DataSource#connectSource()
	 */
	public void connectSource() {
		System.out.println("mysql data source ");
	}

}
