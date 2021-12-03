package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
private String name;
public Student() {
	
}

public Student(String name) {
	this.name = name;
}
public void iamStudying() {
	System.out.println(this.name +" I am studying..");
}
}
