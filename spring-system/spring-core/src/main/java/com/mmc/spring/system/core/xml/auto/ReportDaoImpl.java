// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml.auto;

import org.springframework.stereotype.Repository;

/** 
 * className: ReportDaoImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Repository("reportDaoImpl")
public class ReportDaoImpl implements ReportDao {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.xml.auto.ReportDao#statisticsReport()
	 */
	public void statisticsReport() {
		System.out.println("statisticsReport dao");
	}

}
