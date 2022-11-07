package com.jdc.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.security.service.Service;
import com.jdc.security.service.SignUpService;
import com.jdc.security.service.model.SignUpDto;

@Controller
@RequestMapping("signup")
public class Test {
	
	@Autowired
	private Service service;
		
	@GetMapping
	String index() {
		return "security/signup";
	}
	@PostMapping
	public String singUp(@Validated @ModelAttribute("dto")SignUpDto dto , BindingResult res) {
		
		if(res.hasErrors()) {
			return "security/signup";
		}
		
		var auth = service.signUp(dto);
		
		SecurityContextHolder.getContext().setAuthentication(auth);
		
		return "redirect:/member/home";
	}
		
	@ModelAttribute("dto")
	SignUpDto dto() {
		return new SignUpDto();
	}
	
}
