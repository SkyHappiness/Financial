package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.entity.User;
import com.financial.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class UserTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testaddUser(){
		User user = new User();
		user.setAge(10);
		user.setName("hahauuu");
		System.out.println(userService.insertUser(user));
	}
	
	@Test
	public void testgetUser() {
		List<User> users = userService.getUsers();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testgetUserById() {
		int id=1;
		User user = userService.findUserById(id);
		System.out.println(user);
	}
	
	@Test
	public void testupdateUser() {
		User user = new User();
		user.setId(8);
		user.setAge(10);
		user.setName("qqq");
		userService.updateUser(user);			
	}
	
	@Test
	public void testdeleteUser() {
		int id=9;
		userService.deleteUser(id);
	}
	
	
}
