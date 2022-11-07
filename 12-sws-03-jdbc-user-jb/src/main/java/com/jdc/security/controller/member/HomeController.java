package com.jdc.security.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.security.service.AccessInfoService;

@Controller("memberHomeController")
@RequestMapping("member")
public class HomeController {
	
	@Autowired
	private AccessInfoService service;

	@GetMapping("home")
	public void home(ModelMap map) {
		if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof User user) {
			map.put("listAll",service.getAll(user.getUsername()));
		}
	}
}
