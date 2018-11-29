package com.bookstore.demos.aspect_oriented_programming.model;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle {

	private int height, base;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void calculateArea() {
		System.out.println("Area of Triangle = " + (0.5 * this.base * this.height));
	}

}
