package com.bookstore.demos.inheritance;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your favorite shape");
		String name = sc.next();

		Shape s = (Shape) context.getBean(name);
		System.out.println(s);

		
		
		
		
		// Circle c = (Circle) context.getBean("circle");
		// System.out.println(c);
		//
		// Triangle t = (Triangle) context.getBean("triangle");
		// System.out.println(t);
	}

}
