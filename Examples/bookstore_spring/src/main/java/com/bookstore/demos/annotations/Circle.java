package com.bookstore.demos.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("circle")
public class Circle {

	@Autowired
	private Point point;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(Point center) {
		this.point = center;
	}

	public void setCenter(Point center) {
		this.point = center;
	}

	public Point getCenter() {
		return point;
	}

	@Override
	public String toString() {
		return "Center of the Circle is at : " + this.point;
	}

}
