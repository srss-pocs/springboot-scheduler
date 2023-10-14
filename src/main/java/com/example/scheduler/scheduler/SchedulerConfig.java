package com.example.scheduler.scheduler;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SchedulerConfig {

	@Scheduled(fixedRate = 2000L) 
	public void job() throws InterruptedException {
		log.info("Current Job Time -->> {}", new Date());
		Thread.sleep(1000L);
	}
}
