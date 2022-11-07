package com.jdc.security.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jdc.security.service.model.SignUpDto;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private SimpleJdbcInsert insert;
	
	public Authentication signUp(SignUpDto dto) {
		
		var param = new HashMap<String, Object>();
		param.put("login", dto.getLoginId());
		param.put("name", dto.getLoginId());
		param.put("password", bcrypt.encode(dto.getPassword()));
		
		var res = insert.execute(param);
		
		//programmatic sign up
		if(res == 1) {
			var token = new UsernamePasswordAuthenticationToken(dto.getLoginId(), dto.getPassword());
			return authManager.authenticate(token);
		}
		return null;
	}
	
}
