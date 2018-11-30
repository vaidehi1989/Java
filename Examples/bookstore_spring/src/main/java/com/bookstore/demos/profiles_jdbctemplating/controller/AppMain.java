package com.bookstore.demos.profiles_jdbctemplating.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;

public class AppMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		System.out.println("Setting up profile");

		// Sets the active profiles
		context.getEnvironment().setActiveProfiles("Production");

		context.scan("com.bookstore.demos.profiles_jdbctemplating");
		context.refresh();

		StudentController sc = (StudentController) context.getBean("studentcontroller");

		List<Student> list = sc.getStudents();

		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println("closing context");
		context.close();
	}

}
