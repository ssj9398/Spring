package com.example.test;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.MemberService;
import com.example.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class MyTest {
	
	@Autowired
	MemberService memberService;
	
	@Ignore @Test
	public void test() {
		MemberVO member = new MemberVO("younghee", "이영희", 44);
		int row = memberService.insertMember(member);
		assertSame(row, 1);
	}
	
	@Ignore @Test
	public void test1() {
		List<MemberVO> list = this.memberService.selectAllMember();
		assertSame(3, list.size());
		for(MemberVO member : list) {
			System.out.println(member);
		}
	}
	@Test
	public void test2() {
		MemberVO member = this.memberService.selectMember("younghee");
		System.out.println(member);
	}

}
