package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Student;

@Configuration
@ComponentScan(basePackages = {"com.example.model"})
public class MyConfig {
	@Bean
	public Student getStudent1() {
		System.out.println("Creating Student 1 object");
		return new Student("I am Student 1");
		
	}
//	@Bean("student2")
//	@Lazy
//	public Student getStudent2() {
//		System.out.println("Creating Student 2 object");
//		return new Student("I am Student 2");
//		
//	}

}
