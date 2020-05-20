package com.dawalberto.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UnicycleCoach implements Coach {

	@Qualifier("happyFortuneService")
	@Autowired
	private FortuneService fortuneService;
	
	// As a Spring Framework 4.3 an @Autowired annotaion is no longer necessary if the bean only defines one constructor.
//	public UnicycleCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Do three rolling wraps and one 360º spin";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
