package com.ydd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ydd.entity.User;
import com.ydd.service.IUserService;

@RequestMapping("/user")
@Controller
public class UserContorller {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping(value ="/getUserById")
	@ResponseBody
	public User getUserById(Integer id){
		System.out.println("--------------------------");
		User user = userService.queryOneUserById(id);
		System.out.println(user);
		//model.addAttribute("user", user);
		//return "showUser";
		return user ;
	}
	@RequestMapping(value ="/getUserByIdOnPage")
	public String getUserByIdOnPage(Integer id, Model model){
		System.out.println("--------------------------");
		User user = userService.queryOneUserById(id);
		System.out.println(user);
		model.addAttribute("user", user);
		return "showUser";
		
	}
	
}
