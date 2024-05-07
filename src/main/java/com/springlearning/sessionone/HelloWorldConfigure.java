package com.springlearning.sessionone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfigure {

    @Bean
    String name() {
		return "Bilal";
	}
	
}
