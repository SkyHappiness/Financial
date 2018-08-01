package com.financial.dao;

import java.util.List;

import com.financial.entity.ProfileInfo;

public interface ProfileDao {
	//查询所有收益信息
	 public List<ProfileInfo> getProfileInfo();
	 //查询昨日收益
	 public List<Double> getyesterdayMoney();
	 //查询产品总收益
	 public List<Double> getprofileMoney();
}
