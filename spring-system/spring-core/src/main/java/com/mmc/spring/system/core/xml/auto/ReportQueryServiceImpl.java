// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.xml.auto;

import org.springframework.stereotype.Service;

/** 
 * className: ReportQueryServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月8日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("reportQueryServiceImpl")
public class ReportQueryServiceImpl implements ReportService {

	/* (non-Javadoc)
	 * @see com.mmc.spring.system.core.xml.auto.ReportService#statisticsReport()
	 */
	public void statisticsReport() {
		System.out.println("reportQueryServiceImpl");
	}

}
