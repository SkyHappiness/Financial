package com.financial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.dao.BuyInfoDao;
import com.financial.entity.BuyInfo;
import com.financial.service.BuyInfoService;

@Service
public class BuyInfoServiceImpl implements BuyInfoService{
	@Autowired
	private BuyInfoDao buyInfoDao;
		
	@Override
	public List<BuyInfo> getBuyInfo() {
		// TODO Auto-generated method stub
		List<BuyInfo> allBuyInfo=buyInfoDao.getBuyInfo();
		return allBuyInfo;
	}

	@Override
	public int getAllBuyMoney() {
		// TODO Auto-generated method stub
		int[] ary=buyInfoDao.getBuyMoney();
		int sum = 0;
		for(int i=0;i<ary.length; i++){
		sum=sum+ary[i];
		}
		return sum;
	}

}
