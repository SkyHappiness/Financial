package com.financial.service;

import java.util.List;

import com.financial.entity.User;

//业务层
public interface UserService {
	
	public int insertUser(User user);
	
	public List<User> getUsers();
	
	public User findUserById(int id);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(int id);

	
	  
	
}
