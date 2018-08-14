package com.financial.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProfileJob {
	
	@Scheduled(cron="0 0 8 * * ?")
    public void profileUpdate(){
		//System.out.println(" taskJob：：："+new Date()); 
		//更新flag
		//查询万份利率
		//计算收益
		//批量更新收益
    }
}
