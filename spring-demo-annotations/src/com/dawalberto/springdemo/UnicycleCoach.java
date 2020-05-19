package com.dawalberto.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UnicycleCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do three rolling wraps and one 360º spin";
	}

}
