package com.example.vo;

public class MemberVO {
	private String userid;
	private String name;
	private int age;
	
	public MemberVO(String userid, String name, int age) {
		this.userid = userid;
		this.name = name;
		this.age = age;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", name=" + name + ", age=" + age + "]";
	}
	
}
