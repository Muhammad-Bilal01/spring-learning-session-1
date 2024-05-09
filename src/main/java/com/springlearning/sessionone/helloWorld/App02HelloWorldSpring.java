package com.springlearning.sessionone.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
	// 1: launch the spring context
		// using AnnotationConfigApplicationContext();
	
		
		
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfigure.class))
		{
			
			// 2: Configure the things that we want spring to manage - @Configuration
				// create a class of HelloWorldConfiguration with @Configuration
				// create a bean name - @Bean | method of @configuration class
			
			// 3: Retreiving beans managed by Spring	
			
			System.out.println(
					context.getBean("name"));
			
			System.out.println(
					context.getBean("age"));
			
			System.out.println(
					context.getBean("person"));

			System.out.println(
					context.getBean("person2MethodCall"));
			
			System.out.println(
					context.getBean("person3Parameters"));
			
			System.out.println(
					context.getBean("person4Qualifier"));
			
			System.out.println(
					context.getBean("address2")); // call it by Bean Name
			

			System.out.println(
					context.getBean(Address.class)); // also called it by Bean Type 
			
//			to get all the beans which are available in this container
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			
			
//			System.out.println(context.getBean("noname")); // throw an Error:- No bean named 'noname' available
			

			
		}
		

		
			
	}

}
