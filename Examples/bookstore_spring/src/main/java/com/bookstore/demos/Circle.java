package com.bookstore.demos;

public class Circle {

	private Point center;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(Point center) {
		this.center = center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}

	@Override
	public String toString() {
		return "Center of the Circle is at : " + this.center;
	}

}
