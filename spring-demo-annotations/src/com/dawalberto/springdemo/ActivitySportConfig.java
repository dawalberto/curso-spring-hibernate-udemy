package com.dawalberto.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivitySportConfig {

	@Bean
	public FortuneService hardFortuneService() {
		return new HardFortuneService();
	}
	
	@Bean
	public Coach parkourCoach() {
		return new ParkourCoach(hardFortuneService());
	}
	
}
