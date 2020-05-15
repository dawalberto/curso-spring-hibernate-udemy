package com.dawalberto.springdemo;

public class UnicycleCoach implements Coach {

	private FortuneService fortuneService;
	
	public UnicycleCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 5 rolling wraps and 1 360";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

}
