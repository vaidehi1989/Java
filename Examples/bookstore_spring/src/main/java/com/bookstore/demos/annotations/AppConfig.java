package com.bookstore.demos.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bookstore.demos.annotations")
public class AppConfig {

	@Bean(name = "p1")
	public Point get1() {
		Point p = new Point(5, 5);
		return p;
	}

	@Bean(name = "p2")
	public Point getP2() {
		Point p = new Point(0, 5);
		return p;
	}

	@Bean(name = "p3")
	public Point getP3() {
		Point p = new Point(5, 0);
		return p;
	}

	@Bean(name = "p4")
	public Point getP4() {
		Point p = new Point(0, 0);
		return p;
	}

	@Bean(name = "Rectangle")
	public Rectangle getRectangle() {
		return new Rectangle();
	}

}
