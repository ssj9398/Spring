package com.example;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jdk.nashorn.internal.ir.annotations.Ignore;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SpringAppTest {
	@Autowired
	GenericXmlApplicationContext ctx;
	
	@Test
	public void init() {
		if(this.ctx==null) System.out.println("Context null....");
		else System.out.println("Not null");
	}
	
	@Ignore @Test
	public void test1() {
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}
	
	@After
	public void close() {
		ctx.close();
	}

}
