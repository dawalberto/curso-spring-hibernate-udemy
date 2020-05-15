package com.dawalberto.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"Today is your lucky day!", "Every man is the architect of his own fortune.", "Fortune befriends the bold."};
	
	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)];
	}
	
}
