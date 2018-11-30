package com.bookstore.demos.profiles_jdbctemplating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;
import com.bookstore.demos.profiles_jdbctemplating.service.StudentService;

@Component("studentcontroller")
public class StudentController {

	@Autowired
	StudentService service;

	@Autowired
	Student student;

	public boolean insertStudent(String name, int marks) {
		student.setName(name);
		student.setMarks(marks);
		service.insertStudent(student);
		return true;
	}

	public List<Student> getStudents() {
		return service.getAllStudents();
	}

}
