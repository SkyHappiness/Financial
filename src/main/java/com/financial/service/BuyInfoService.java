package com.financial.service;

import java.util.List;

import com.financial.entity.BuyInfo;

public interface BuyInfoService {
	 //查询所有交易信息
	 public List<BuyInfo> getBuyInfo();
	 //计算所有交易金额
	 public int getBuyMoney();
}
