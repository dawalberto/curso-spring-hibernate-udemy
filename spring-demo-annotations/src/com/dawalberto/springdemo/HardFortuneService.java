package com.dawalberto.springdemo;

public class HardFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You may fall today";
	}

}
