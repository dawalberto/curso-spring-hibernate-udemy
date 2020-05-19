package com.dawalberto.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Every man is the architect of his own fortune.";
	}

}
