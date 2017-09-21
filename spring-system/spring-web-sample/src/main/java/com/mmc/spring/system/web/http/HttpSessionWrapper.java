// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.http;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.http.HttpRequest;

/** 
 * className: HttpSessionWrapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月21日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class HttpSessionWrapper implements HttpSession {
	
	private final String sid;
	private HttpSession session;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private Map<String, Object> map;
	
	public HttpSessionWrapper(String sid) {
		this.sid = sid;
	}
	
	public HttpSessionWrapper(String sid, HttpSession session) {
		this(sid);
		this.session = session;
	}
	
	public HttpSessionWrapper(String sid, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		this(sid, session);
		this.request = request;
		this.response = response;
	}
	
	private Map<String, Object> getSessionMap() {
		if (map == null) {
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getCreationTime()
	 */
	public long getCreationTime() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getId()
	 */
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getLastAccessedTime()
	 */
	public long getLastAccessedTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getServletContext()
	 */
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#setMaxInactiveInterval(int)
	 */
	public void setMaxInactiveInterval(int interval) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getMaxInactiveInterval()
	 */
	public int getMaxInactiveInterval() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getSessionContext()
	 */
	public HttpSessionContext getSessionContext() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getAttribute(java.lang.String)
	 */
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getValue(java.lang.String)
	 */
	public Object getValue(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getAttributeNames()
	 */
	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#getValueNames()
	 */
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#setAttribute(java.lang.String, java.lang.Object)
	 */
	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#putValue(java.lang.String, java.lang.Object)
	 */
	public void putValue(String name, Object value) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#removeAttribute(java.lang.String)
	 */
	public void removeAttribute(String name) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#removeValue(java.lang.String)
	 */
	public void removeValue(String name) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#invalidate()
	 */
	public void invalidate() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSession#isNew()
	 */
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

}
