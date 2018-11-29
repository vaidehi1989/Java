package com.bookstore.demos.aspect_oriented_programming.model;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle {
	private int length, breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void calculateArea() {
		System.out.println("Area of Recatangle = " + (this.length * this.breadth));
	}

}
