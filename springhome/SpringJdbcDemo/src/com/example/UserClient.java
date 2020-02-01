package com.example;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException ex) {
			System.out.println(ex);

		}
	}

}