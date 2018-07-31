package com.financial.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.dao.UserDao;
import com.financial.entity.User;
import com.financial.service.UserService;


@Service
public class UserServiceImpl implements UserService{
    
	@Autowired
	private UserDao userDao;
	
	@Override
	public int insertUser(User user) {
		int flag = 0;
		try {
			flag =  userDao.insertUser(user);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<User> getUsers() {	
	  List<User> allUser= userDao.getUsers();
		return allUser;
	}
	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		User user = userDao.findUserById(id);
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}


}
