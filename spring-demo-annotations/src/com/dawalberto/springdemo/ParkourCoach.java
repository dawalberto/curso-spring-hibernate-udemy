package com.dawalberto.springdemo;

public class ParkourCoach implements Coach {

	private FortuneService fortuneService;
	
	public ParkourCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do one backflip and two front flip";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
