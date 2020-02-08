package com.example.vo;

public class HelloVO {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello " + name;
	}
}
