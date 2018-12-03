package com.bookstore.springmvc.dao;

import java.util.List;

import com.bookstore.springmvc.model.Student;

public interface StudentDAO {

	public Student getStudent(int rno);

	public List<Student> getAllStudents();
	
	public boolean insertStudent(Student student);

	public boolean updateStudent(Student student);

	public boolean deleteStudent(Student student);
	
	

}
