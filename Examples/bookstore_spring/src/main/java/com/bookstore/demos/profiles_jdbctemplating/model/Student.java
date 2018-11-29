package com.bookstore.demos.profiles_jdbctemplating.model;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private int rno;
	private String name;
	private int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return this.rno + "\t" + this.name + "\t" + this.marks;
	}

}
