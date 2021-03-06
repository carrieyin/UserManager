package com.ydd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ydd.entity.User;
import com.ydd.mapper.UserMapper;
import com.ydd.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userMapper;
	
	public User queryOneUserById(Integer id) {
		return userMapper.queryOneUserById(id);
	}

}
