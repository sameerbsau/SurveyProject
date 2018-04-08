package com.merilytics.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableAsync
@EnableScheduling
public class MyTaskScheduler {
	@Scheduled(fixedDelay=5000)
	public void doSomething() {
	    // something that should execute periodically
		
		System.out.println("yay.... i am enjoying here");
	}
}
