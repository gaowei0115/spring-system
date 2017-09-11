// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.spring.system.web.base.domain;

import java.util.Date;

/** 
 * className: Spittle<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月11日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class Spittle {

	private final Long id;
	private final String message;
	private final Date time;
	private final Double latitude;
	private final Double longitude;
	
	public Spittle(Long idInit, String messageInit, Date timeInit, Double latitudeInit, Double longitudeInit) {
		this.id = idInit;
		this.message = messageInit;
		this.time = timeInit;
		this.latitude = latitudeInit;
		this.longitude = longitudeInit;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
