package com.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.job.ProfileJob;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class JobTest {
	
	@Autowired 
	private ProfileJob profileJob;
	
	@Test
	public void testProfileJob() {
		profileJob.flagUpdate();
	}
	
	@Test
	public void testProfileUpdate() {
		profileJob.profileUpdate();
	}
}
