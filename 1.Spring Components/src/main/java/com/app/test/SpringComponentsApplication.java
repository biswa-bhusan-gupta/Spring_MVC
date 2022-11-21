package com.app.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringComponentsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  SpringApplication.run(SpringComponentsApplication.class, args); // Here Container of Spring Bean is Created,By run,It returns Context where it initializes a Container and in this container it will try to create all objects  
		// Beans are created by BeanFactory Interface or Application Context Sub Interface
		
		System.out.println("In Spring Boot");
		
		Alien a1 = context.getBean(Alien.class); // Developer wants a Bean of Alien named as "Alien.class" in Spring Container
		// In Spring Alien.Class creates an Object of Alien Class which is available in Spring Container as Spring Bean
	    a1.show();
	    
	    Alien a2 = context.getBean(Alien.class);
	    a2.show();
	}

}
