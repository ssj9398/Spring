package com.example.biz;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int userid;
	private String name;
	private int age;
	private String address;
}
