package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = context.getBean("student1", Student.class);
		System.out.println(student1);
		
		//Student student3 = (Student) context.getBean("student3");
		Student student3 = context.getBean("student1", Student.class);
		
		if(student3==student1) System.out.println("Equlas");
		
		Student student2 = context.getBean("student2", Student.class);
		System.out.println(student2);
		context.close();
	}
}