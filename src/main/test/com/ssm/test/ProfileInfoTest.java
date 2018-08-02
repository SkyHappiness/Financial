package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.entity.ProfileInfo;
import com.financial.service.ProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class ProfileInfoTest {

	@Autowired
	private ProfileService profileService;
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
}