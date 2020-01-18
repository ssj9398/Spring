package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppTest {
	GenericXmlApplicationContext context;
	
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("config/applicationContext.xml");
	}
	
	@Test
	public void test1() {
		MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}
	
	@After
	public void close() {
		context.close();
	}

}
