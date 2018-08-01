package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.entity.BuyInfo;
import com.financial.service.BuyInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class BuyInfoTest {
	@Autowired
	private BuyInfoService buyInfoService;
	
	@Test
	public void testgetBuyInfo() {
		List<BuyInfo> allBuyInfo = buyInfoService.getBuyInfo();
		for (BuyInfo BuyInfo : allBuyInfo) {
			System.out.println(BuyInfo);
		}
	}
	
	
	@Test
	public void testgetAllBuyMoney() {
		int money=buyInfoService.getAllBuyMoney();
		System.out.println(money);
	}
}
