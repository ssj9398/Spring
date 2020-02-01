package com.example.test;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Employee;

public class BeanTest {
	ApplicationContext ctx;

	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:beans.xml");
	}

	@Test
	public void test1() {
		Employee jimin = this.ctx.getBean("emp1", Employee.class);

		Employee yonghee = (Employee) this.ctx.getBean("emp1");

		//assertEquals(jimin, yonghee);   주소비교
		if(jimin == yonghee) System.out.println("Equals");
		else System.out.println("Difficult");

	}

}
