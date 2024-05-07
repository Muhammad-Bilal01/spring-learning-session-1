package com.springlearning.sessionone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlearning.sessionone.game.GameRunner;
import com.springlearning.sessionone.game.MarioGame;
import com.springlearning.sessionone.game.PacmanGame;
import com.springlearning.sessionone.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
	// 1: launch the spring context
		// using AnnotationConfigApplicationContext();
	
		var context = new AnnotationConfigApplicationContext(HelloWorldConfigure.class);
		
	// 2: Configure the things that we want spring to manage - @Configuration
		// create a class of HelloWorldConfiguration with @Configuration
		// create a bean name - @Bean | method of @configuration class
		
	// 3: Retreiving beans managed by Spring	
		System.out.println(
				context.getBean("name"));
		
	}

}
