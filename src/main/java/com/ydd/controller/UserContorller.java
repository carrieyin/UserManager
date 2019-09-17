package com.ydd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ydd.entity.User;
import com.ydd.service.IUserService;

@RequestMapping("/user")
public class UserContorller {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String showUserName(HttpServletRequest request, Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.queryOneUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
