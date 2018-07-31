package com.financial.dao;

import java.util.List;

import com.financial.entity.User;

//数据库访问层
public interface UserDao {

 //插入
  public int insertUser(User user);
  //查询（所有）
  public List<User> getUsers();
  //查询（按照ID）
  public User findUserById(int id);
  //更新
  public boolean updateUser(User user);
  //删除
  public boolean deleteUser(int id);
  
  
}
