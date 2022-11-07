package com.jdc.security.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jdc.security.service.model.SignUpDto;

@Service
public class SignUpService {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private SimpleJdbcInsert userInsert;
	
	@Autowired
	private PasswordEncoder bcy;

	public Authentication signUp(SignUpDto dto) {
		//insert into database
		var params = new HashMap<String, Object>();
		params.put("name", dto.getName());
		params.put("login", dto.getLoginId());
		params.put("password", bcy.encode(dto.getPassword()));
		
		var result = userInsert.execute(params);
		//programmatic login
		if(result == 1) {
			var token = new UsernamePasswordAuthenticationToken(dto.getLoginId(), dto.getPassword());
		return	authManager.authenticate(token);
		}
		return null;
	}
}
