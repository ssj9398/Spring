package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() { // Student studen1 = new Student();
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("영화감상");
		hobbys.add("요리");
		Student student = new Student("한지민", 25, hobbys);
		student.setHeight(165);
		student.setWeight(45);
		return student;
	}

	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("노래부르기");
		hobbys.add("게임");
		Student student = new Student("설운도", 50, hobbys);
		student.setHeight(175);
		student.setWeight(75);
		return student;
	}

}
