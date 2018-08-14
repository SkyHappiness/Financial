package com.financial.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.financial.entity.ProfileInfo;

public interface ProfileDao {
	//查询所有收益信息
	 public List<ProfileInfo> getProfileInfo();
	 //查询昨日收益
	 public List<Double> getyesterdayMoney();
	 //查询产品总收益
	 public List<Double> getprofileMoney();	 
	 //插入收益信息
	 public int insertProfileInfo(ProfileInfo profileInfo);
	 //批量更新收益
	 public int updateProfileBatch(@Param("list") List<ProfileInfo> list);
	 //查询收益信息，万份收益
	 public List<ProfileInfo> getProfileInfoAndDayPro();
	 //更新Flag
	 public int updateFlag(@Param("list") List<Long> list);
}
