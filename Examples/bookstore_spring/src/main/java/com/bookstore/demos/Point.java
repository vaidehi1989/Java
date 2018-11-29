package com.bookstore.demos;

public class Point {

	private int x;
	private int y;

	public Point() {
		// System.out.println("Default Constructor invoked!!!");
	}

	public Point(int x, int y) {
		// System.out.println("Parametrised Constructor invoked!!!");
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		// System.out.println("x using constructor");
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	/*
	 * @Override public boolean equals(Object obj) { Point p = (Point) obj; if
	 * (this.x == p.x && this.y == p.y) { return true; } return false; }
	 */
}
