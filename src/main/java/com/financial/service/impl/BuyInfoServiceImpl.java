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
	public int getBuyMoney(){
		// TODO Auto-generated method stub
		List<Integer> list=buyInfoDao.getBuyMoney();
		if (list.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		return sum;
	}

}
