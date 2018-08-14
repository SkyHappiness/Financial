package com.financial.dao;

import java.util.List;

import com.financial.entity.BuyInfo;

public interface BuyInfoDao {
	     //查询所有交易信息
		 public List<BuyInfo> getBuyInfo();
		 //获取交易金额
		 public List<Integer> getBuyMoney();

		 
}
