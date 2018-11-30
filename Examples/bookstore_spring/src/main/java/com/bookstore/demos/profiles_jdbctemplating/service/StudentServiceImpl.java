package com.bookstore.demos.profiles_jdbctemplating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demos.profiles_jdbctemplating.dao.StudentDAO;
import com.bookstore.demos.profiles_jdbctemplating.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	public Student getStudent(int rno) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	public boolean insertStudent(Student student) {
		studentDAO.insertStudent(student);
		return false;
	}

	public boolean updateStudent(int rno) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(int rno) {
		// TODO Auto-generated method stub
		return false;
	}

}
