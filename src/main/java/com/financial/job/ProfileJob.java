package com.financial.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.financial.dao.BuyInfoDao;
import com.financial.dao.ProfileDao;
import com.financial.entity.BuyInfo;
import com.financial.entity.ProfileInfo;

@Component
public class ProfileJob {
	
	@Autowired
	private BuyInfoDao buyInfoDao;
	
	@Autowired
	private ProfileDao profileDao;
	
	@Scheduled(cron="0 0 8 * * ?")
    public void profileUpdate(){
		try {
			//查询所有有效收益信息
			List<ProfileInfo> list = profileDao.getProfileInfoAndDayPro();
			if (list.isEmpty()) {
				return;
			}
			for (ProfileInfo profileInfo : list) {
				//计算收益
				double profile = profileInfo.getBuyMoney() * profileInfo.getDayPro() / 10000;
				profileInfo.setProfileYestoday(profile);
				profileInfo.setProfileMoney(profileInfo.getProfileMoney() + profile);				
			}
			//更新收益
			profileDao.updateProfileBatch(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	//更新过期购买的flag
	@Scheduled(cron="0 0 9 * * ?")
    public void flagUpdate(){
		List<Long> times = new ArrayList<>();
		try {
			//查询所有购买信息
			List<BuyInfo> list = buyInfoDao.getBuyInfo();
			if (list.isEmpty()) {
				return;
			}
			//获取所有过期购买
			for (BuyInfo buyInfo : list) {
				if (buyInfo.getEndTime().getTime() < System.currentTimeMillis()) {
					times.add(buyInfo.getTime());
				}
			}
			//更新过期购买flag
			if (times.isEmpty()) {
				return;
			}
			profileDao.updateFlag(times);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
}
