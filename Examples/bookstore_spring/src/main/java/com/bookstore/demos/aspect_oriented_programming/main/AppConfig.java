package com.bookstore.demos.aspect_oriented_programming.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.bookstore.demos.aspect_oriented_programming.aspect.ShapeAspects;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.bookstore.demos.aspect_oriented_programming")
public class AppConfig {

	@Bean
	public ShapeAspects getSA() {
		return new ShapeAspects();
	}
}
