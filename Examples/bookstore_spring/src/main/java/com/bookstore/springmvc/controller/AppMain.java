package com.bookstore.springmvc.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.bookstore.springmvc.configuration.AppConfig;
import com.bookstore.springmvc.model.Student;

public class AppMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentRestController sc = context.getBean(StudentRestController.class);
		Student student = new Student("geo", 12);
		student.setRno(122);
		sc.updateStudent(122, student);
		System.out.println("closing context");
		context.close();
	}

}
