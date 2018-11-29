package com.bookstore.demos.inheritance;

import java.util.List;

public abstract class Shape {

	private List<Point> points;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public List<Point> getPoints() {
		return points;
	}

	@Override
	public String toString() {
		String var = "The vertices are : ";

		for (Point p : points) {
			var += p + ",";
		}
		return var;
	}

}
