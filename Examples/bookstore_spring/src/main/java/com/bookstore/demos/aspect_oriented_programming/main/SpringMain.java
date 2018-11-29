package com.bookstore.demos.aspect_oriented_programming.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bookstore.demos.aspect_oriented_programming.model.Circle;
import com.bookstore.demos.aspect_oriented_programming.model.Rectangle;
import com.bookstore.demos.aspect_oriented_programming.model.Triangle;

public class SpringMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Circle c = context.getBean(Circle.class);
		c.setRadius(2);
		c.calculateArea();
		c.calculateCircumference();

		Rectangle r = context.getBean("rectangle", Rectangle.class);
		r.setBreadth(5);
		r.setLength(3);
		r.calculateArea();

		Triangle t = context.getBean("triangle", Triangle.class);
		t.setBase(4);
		t.setHeight(5);
		t.calculateArea();

	}

}
