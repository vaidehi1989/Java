package com.bookstore.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.springmvc.dao.StudentDAO;
import com.bookstore.springmvc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	@Transactional
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	@Transactional
	public boolean insertStudent(Student student) {
		studentDAO.insertStudent(student);
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public Student findStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean isStudentExist(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteAllStudents() {
		// TODO Auto-generated method stub

	}

}
