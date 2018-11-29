package com.bookstore.demos.profiles_jdbctemplating.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		System.out.println("Setting up profile");

		// Sets the active profiles
		context.getEnvironment().setActiveProfiles("Production");

		context.scan("com.demo.profiles_jdbctemplating");
		context.refresh();

		StudentController sc = context.getBean(StudentController.class);

		sc.insertStudent("Ankit", 50);

		System.out.println("closing context");
		context.close();
	}

}
