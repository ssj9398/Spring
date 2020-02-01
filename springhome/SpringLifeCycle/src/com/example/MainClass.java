package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 111111111111111 //Container 생성 GenericXmlApplicationContext ctx = new
		 * GenericXmlApplicationContext();
		 * 
		 * // Container 설정 ctx.load("classpath:beans.xml"); ctx.refresh();
		 * 
		 * // Container를 통한 Bean 관리하기 Student jimin =
		 * ctx.getBean("student1",Student.class);
		 * 
		 * // Bean생성 뿐 아니라 초기화됨 System.out.println(jimin);
		 * 
		 * 
		 * 
		 * // Container 소멸 ctx.close();
		 */

		// 222222222222//
		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext(ApplicationConfig.class);
		 * 
		 * Student jimin = ctx.getBean("student2", Student.class);
		 * System.out.println(jimin); // Container 소멸 ctx.close();
		 */
		// *****************//

		// Container 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		// Container 설정
		ctx.load("classpath:beans.xml");
		ctx.refresh();

		// Container를 통한 Bean 관리하기
		Student jimin = ctx.getBean("student5", Student.class);
		
		// Bean생성 뿐 아니라 초기화됨
		System.out.println(jimin);

		// Container 소멸
		ctx.close();

	}
}
