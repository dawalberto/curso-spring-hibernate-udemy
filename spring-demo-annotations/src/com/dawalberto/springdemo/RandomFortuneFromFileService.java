package com.dawalberto.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneFromFileService implements FortuneService {

	private List<String> fortunes = new ArrayList<String>();	
	
	@Override
	public String getFortune() {
		try {
			FileReader file = new FileReader(new File("/Users/dawalberto/Code/Workspaces/Java/eclipse/curso-spring-hibernate-udemy/spring-demo-annotations/src/com/dawalberto/springdemo/fortunes.txt"));
			BufferedReader reader = new BufferedReader(file);
			String line;

			while ((line = reader.readLine()) != null) {
				fortunes.add(line);
			}
			
			reader.close();
		} catch (Exception e) { }
		
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}

}
