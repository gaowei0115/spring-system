// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.spring.system.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/** 
 * ClassName: StudentService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年9月8日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
@Service("studentService")
@Scope("singleton")
public class StudentService {

}
