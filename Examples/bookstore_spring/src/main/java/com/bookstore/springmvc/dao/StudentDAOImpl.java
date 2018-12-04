package com.bookstore.springmvc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.springmvc.model.Student;

@Repository
public class StudentDAOImpl extends AbstractDao implements StudentDAO {

	public Student getStudent(int rno) {
		Student student = getSession().get(Student.class, rno);
		return student;
	}

	public List<Student> getAllStudents() {

		TypedQuery<Student> studentList = getSession().createQuery("from Student");

		return studentList.getResultList();
	}

	public boolean insertStudent(Student student) {

		getSession().save(student);
		return true;
	}

	public boolean updateStudent(Student student) {
		getSession().update(student);
		System.out.println("IN DAO" + getStudent(student.getRno()));
		return true;
	}

	public boolean deleteStudent(Student student) {
		getSession().delete(student);
		return true;
	}

}
