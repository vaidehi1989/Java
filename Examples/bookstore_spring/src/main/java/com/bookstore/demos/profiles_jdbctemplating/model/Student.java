package com.bookstore.demos.profiles_jdbctemplating.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private int rno;

	@NotBlank(message = "Name field should not be null")
	private String name;

	@NotNull(message = "Marks field should not be null")
	private int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name2, int marks2) {
		this.marks = marks2;
		this.name = name2;
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
