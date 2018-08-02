package com.financial.service;

import java.util.List;

import com.financial.entity.ProfileInfo;

public interface ProfileService {
	    //查询所有收益信息
		 public List<ProfileInfo> getProfileInfo();
		 //计算总的昨日收益
		 public double getallyesterdayMoney();
		 //查询总的产品总收益
		 public double getallprofileMoney();
}
