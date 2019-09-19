package com.ydd.mapper;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ydd.entity.User;
import com.ydd.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-mvc.xml"})
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	@Resource
	private IUserService userService;
	Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

	
	@Test
	public void testQueryUserById(){
		User user = userMapper.queryOneUserById(5);
		System.out.println(user);
	}
	
	@Test
	public void testQueryUserByIdForServiceImpl(){
		User user = userService.queryOneUserById(2);
		System.out.println(user);
	}
}
