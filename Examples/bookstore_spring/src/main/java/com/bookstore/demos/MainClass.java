package com.bookstore.demos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Triangle t = (Triangle) context.getBean("triangle");

		System.out.println(t);

		Circle c = (Circle) context.getBean("circle");

		System.out.println(c);

	}

}
