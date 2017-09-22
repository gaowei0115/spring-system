// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * className: UserCrontorl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月22日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Controller
@RequestMapping("/user")
public class UserCrontorl {

	@RequestMapping(method={RequestMethod.GET})
	public String user() {
		return "user";
	}
}
