package com.bookstore.demos.aspect_oriented_programming.model;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea(){
		System.out.println("Area = "+(3.14*radius*radius));
	}
	
	public String calculateCircumference(){
		System.out.println("Circumference = "+(3.14*2*radius));
		return "a";
	}
}
