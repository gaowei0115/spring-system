// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.core.aop.xml;

import java.sql.Connection;
import java.sql.DriverManager;

/** 
 * className: DataSourceUtil<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DataSourceUtil {

	private static final String url = "jdbc:mysql://localhost:3306/springboot?user=root&password=root&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT";
	private static Connection conn;
	
	/**
	 */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("加载数据库驱动.....");
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @return
	 */
	public static Connection getConnection() {
		return conn;
	} 
}
