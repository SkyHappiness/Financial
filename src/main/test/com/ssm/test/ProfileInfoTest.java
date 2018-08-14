package com.ssm.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.dao.ProfileDao;
import com.financial.entity.ProfileInfo;
import com.financial.service.ProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class ProfileInfoTest {

	@Autowired
	private ProfileService profileService;
	@Autowired
	private ProfileDao profileDao;
	@Test
	public void testgetProfileInfo() {
		List<ProfileInfo> allProfileInfo = profileService.getProfileInfo();
		for (ProfileInfo profileInfo : allProfileInfo) {
			System.out.println(profileInfo);
		}
	}
	
	
	@Test
	public void testgetallyesterdayMoney() {
		double yer_money=profileService.getallyesterdayMoney();
		System.out.println(yer_money);
	}
	
	@Test
	public void testgetallprofileMoney() {
		double pro_money=profileService.getallprofileMoney();
		System.out.println(pro_money);
	}
	
	@Test
	public void insertProfileInfo() {
		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setProfileProId(4);
		profileInfo.setProfileProName("朝朝盈1");
		profileInfo.setBuyMoney(3000);
		profileInfo.setProfileYestoday(0.0);
		profileInfo.setProfileMoney(0.0);
		int flag = profileService.insertProfileInfo(profileInfo);
		System.out.println(flag);
	}
	
	@Test
	public void testgetProfileInfoAndDayPro() {
		List<ProfileInfo> allProfileInfo = profileDao.getProfileInfoAndDayPro();
		for (ProfileInfo profileInfo : allProfileInfo) {
			System.out.println(profileInfo);
		}
	}
	@Test
	public void testUpdateFlag() {
		List<Long> list = new ArrayList<>();
		list.add(1534251446465l);
		int flag = profileDao.updateFlag(list);
		System.out.println(flag);
	}
}
