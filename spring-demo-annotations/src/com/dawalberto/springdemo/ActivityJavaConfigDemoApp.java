package com.dawalberto.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActivityJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ActivitySportConfig.class); 
		
		Coach coach = context.getBean("parkourCoach", Coach.class);
		
		System.out.println("Daily Workout: " + coach.getDailyWorkout());
		System.out.println("Daily Fortune: " + coach.getDailyFortune());
		
		context.close();
		
	}
	
}
