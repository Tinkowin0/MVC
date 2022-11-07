package com.jdc.security.service.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class AccessInfo {
	
	private int id;
	private String loginId;
	private String userName;
	private LocalDateTime time;
	private Type type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public void setTimeStamp(Timestamp time) {
		if(time != null) {
			this.time = time.toLocalDateTime();
		}
		
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public enum Type{
		Login, Logout
	}

}
