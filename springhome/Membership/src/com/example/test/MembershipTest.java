package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.UserService;
import com.example.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class MembershipTest {

	@Autowired
	UserService userService;

	@Ignore
	@Test
	public void test() {
		// 사용자 조회 test
		UserVO user = userService.getUser("jimin");
		System.out.println(user);
		assertEquals("한지민", user.getName());
	}

	@Test
	public void test1() {
		// 사용자 등록
		// this.userService.insertUser(new UserVO("dooly", "둘리", "남", "경기"));
		for (UserVO user : this.userService.getUserList()) {
			System.out.println(user);
		}
	}
}
