package com.financial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.dao.ProfileDao;
import com.financial.entity.ProfileInfo;
import com.financial.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileDao profiledao;
	@Override
	public List<ProfileInfo> getProfileInfo() {
		// TODO Auto-generated method stub
		List<ProfileInfo> allprofileInfo=profiledao.getProfileInfo();
		return allprofileInfo;
	}
	
	@Override
	public double getallyesterdayMoney() {
		// TODO Auto-generated method stub
		List<Double> list=profiledao.getyesterdayMoney();
		if (list.isEmpty()) {
			return 0;
		}
		double sum_yesterMoney = 0;
		for(int i = 0; i < list.size(); i++){
			sum_yesterMoney += list.get(i);
			//System.out.print(list.get(i));
		}
		return sum_yesterMoney;
	}

	@Override
	public double getallprofileMoney() {
		// TODO Auto-generated method stub
		List<Double> list=profiledao.getprofileMoney();
		if (list.isEmpty()) {
			return 0;
		}
		double sum_proMoney = 0;
		for(int i = 0; i < list.size(); i++){
			sum_proMoney += list.get(i);
		}
		return sum_proMoney;
	}

	@Override
	public int insertProfileInfo(ProfileInfo profileInfo) {
		// TODO Auto-generated method stub
		int flag = 0;
		try {
		profileInfo.setProfileYestoday((double) 0);
		profileInfo.setProfileMoney((double) 0);
		flag=profiledao.insertProfileInfo(profileInfo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
