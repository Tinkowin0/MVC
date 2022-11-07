package com.jdc.security.service.model;

import javax.validation.constraints.NotBlank;

public class SignUpDto {

	@NotBlank(message = "Enter member name")
	private String loginId;
	
	@NotBlank(message = "Enter loginId")
	private String name;
	
	@NotBlank(message = "Enter password")
	private String password;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
