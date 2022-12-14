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

import com.jdc.security.service.SignUpService;
import com.jdc.security.service.model.SignUpDto;

//@Controller
@RequestMapping("signup")
public class SecurityController {
	
	@Autowired
	private SignUpService service;
	
	@GetMapping
	public String index() {
		return "security/signup";
	}
	//when return it do 
	@PostMapping
	public String signUp(@Validated @ModelAttribute("dto") SignUpDto dto , BindingResult res) {
		
		if(res.hasErrors()) {
			return "security/signup";
		}
		
		var authentication = service.signUp(dto);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		return "redirect:/member/home";
	}
	
	@ModelAttribute("dto")
	public SignUpDto dto()  {
		return new SignUpDto();
	}
}
