// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mmc.spring.system.web.base.dao.SpittleDao;

/** 
 * className: SpittleController<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

	@Autowired
	private SpittleDao spittleDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(@RequestParam(value="max", defaultValue="100") Long max, @RequestParam(value="count", defaultValue="20")int count, Model model) {
		model.addAttribute("spittleList", spittleDao.querySpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
}
