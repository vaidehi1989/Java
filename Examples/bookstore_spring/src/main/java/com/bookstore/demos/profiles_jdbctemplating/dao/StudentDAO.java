package com.bookstore.demos.profiles_jdbctemplating.dao;

import java.util.List;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;

public interface StudentDAO {

	public Student getStudent(int rno);

	public List<Student> getAllStudents();
	
	public boolean insertStudent(Student student);

	public boolean updateStudent(Student student);

	public boolean deleteStudent(Student student);
	
	

}
