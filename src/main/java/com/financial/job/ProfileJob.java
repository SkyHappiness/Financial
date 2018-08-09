package com.financial.job;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProfileJob {
	
	@Scheduled(cron="0 0 8 * * ?")
    public void profileUpdate(){
		System.out.println(" taskJob：：："+new Date()); 
    }
}
