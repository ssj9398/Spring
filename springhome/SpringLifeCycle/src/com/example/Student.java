package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student5")
public class Student {
	@Value("${user1.name}")
	private String name;

	@Value("${user1.age}")
	private int age;

	@Value("${user1.hobby1}, ${user1.hobby2}, ${user1.hobby3}")
	private List<String> hobbies;

	@Value("${user1.height}")
	private double height;

	@Value("${user1.weight}")
	private double weight;

	/*
	 * public Student(String name, int age, List<String> hobbies) { this.name =
	 * name; this.age = age; this.hobbies = hobbies; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public List<String> getHobbies() { return hobbies; }
	 * 
	 * public void setHobbies(List<String> hobbies) { this.hobbies = hobbies; }
	 * 
	 * public double getHeight() { return height; }
	 * 
	 * public void setHeight(double height) { this.height = height; }
	 * 
	 * public double getWeight() { return weight; }
	 * 
	 * public void setWeight(double weight) { this.weight = weight; }
	 */

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", height="
				+ height + ", hobby=" + hobbies + "]";
	}

}
