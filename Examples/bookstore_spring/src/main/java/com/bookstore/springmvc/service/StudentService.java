package com.bookstore.springmvc.service;

import java.util.List;

import com.bookstore.springmvc.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public boolean insertStudent(Student student);

	public boolean updateStudent(Student student);

	public Student findStudentById(int id);

	public boolean isStudentExist(Student student);

	public boolean deleteStudentById(int id);


}
