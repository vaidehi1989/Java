package com.bookstore.demos.profiles_jdbctemplating.service;

import java.util.List;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;

public interface StudentService {

	public Student getStudent(int rno);

	public List<Student> getAllStudents();

	public boolean insertStudent(Student student);

	public boolean updateStudent(int rno);

	public boolean deleteStudent(int rno);

}
