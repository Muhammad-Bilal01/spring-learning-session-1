package com.springlearning.sessionone.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfigure {

    @Bean
    String name() {
		return "Bilal";
	}
    
    @Bean
    int age() {
    	return 15;
    }
	
    @Bean
    Person person() {
    	return new Person("Ahmed",22, new Address("Larkana","Sindh"));
    }
    
//    There are 2 ways to create dependent Bean from one to other
//    - Method Call
//    - Paremeters Method
    
    
//    Method Call
    @Bean
    Person person2MethodCall() {
    	return new Person(name(),age(),address());
    }
    
    @Bean
    Person person3Parameters(String name, int age, Address address) { // add by Bean name
//    	like : name, age, address2
    	return new Person(name,age,address);
    }
    
    
    @Bean
    Person person4Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) { // add by Bean name
//    	like : name, age, address2
    	return new Person(name,age,address);
    }
    
    
    @Bean(name = "address2")
    @Primary // that make it high priortize
    Address address() {
    	return new Address("Garden","Karachi");
    }
    
    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    Address address3() {
    	return new Address("natya Gali","Lahore");
    }
    
    
    
}


// Custom Classes using Record
// record is a new feature introduce in jdk 16

record Person(String name, int age,Address address) {};

record Address(String firstLine,String city) {};
