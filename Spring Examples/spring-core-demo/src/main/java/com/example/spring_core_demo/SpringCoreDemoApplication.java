package com.example.spring_core_demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	// @Bean
	// CommandLineRunner run(Car car){
	// 	return args -> car.drive();
	// }

	// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	// Car car = context.getBean(Car.class);
	// car.drive();

}
