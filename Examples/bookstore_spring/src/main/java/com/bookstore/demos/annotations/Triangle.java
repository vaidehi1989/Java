package com.bookstore.demos.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle {

	private Point vertexA;
	private Point vertexB;
	private Point vertexC;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Triangle(Point vertexA, Point vertexB, Point vertexC) {
		this.vertexA = vertexA;
		this.vertexB = vertexB;
		this.vertexC = vertexC;
	}

	public Point getVertexA() {
		return vertexA;
	}

	public void setVertexA(Point vertexA) {
		this.vertexA = vertexA;
	}

	public Point getVertexB() {
		return vertexB;
	}

	public void setVertexB(Point vertexB) {
		this.vertexB = vertexB;
	}

	public Point getVertexC() {
		return vertexC;
	}

	public void setVertexC(Point vertexC) {
		this.vertexC = vertexC;
	}

	@Override
	public String toString() {
		return "The 3 vertices of Triangle are : " + this.vertexA + ", " + this.vertexB + " and " + this.vertexC;
	}

}
