package com.bookstore.springmvc.service;

import java.util.List;

import com.bookstore.springmvc.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public boolean insertStudent(Student student);

	public boolean updateStudent(Student student);

	public Student findStudentById(long id);

	public boolean isStudentExist(Student student);

	public void deleteStudentById(long id);

	public void deleteAllStudents();

}
