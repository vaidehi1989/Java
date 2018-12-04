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
	@Transactional
	public boolean updateStudent(Student student) {

		return studentDAO.updateStudent(student);
	}

	@Override
	@Transactional
	public Student findStudentById(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	@Transactional
	public boolean isStudentExist(Student student) {

		if (studentDAO.getStudent(student.getRno()) == null) {
			return false;
		}
		return true;
	}

	@Override
	@Transactional
	public boolean deleteStudentById(int id) {
		Student student = studentDAO.getStudent(id);
		if (student == null) {
			return false;
		}
		studentDAO.deleteStudent(student);
		return true;

	}

}
