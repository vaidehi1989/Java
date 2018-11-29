package com.bookstore.demos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.bookstore.demos.annotations");
		context.refresh();

		// Circle c = context.getBean("circle", Circle.class);
		//
		// c.getCenter().setX(4);
		// c.getCenter().setY(5);
		// System.out.println(c);

		Triangle t = context.getBean("triangle", Triangle.class);

		t.getVertexA().setX(0);
		t.getVertexA().setY(0);
		t.getVertexB().setX(0);
		t.getVertexB().setY(4);
		t.getVertexC().setX(4);
		t.getVertexC().setY(0);
		System.out.println(t);

		context.close();

	}

}
