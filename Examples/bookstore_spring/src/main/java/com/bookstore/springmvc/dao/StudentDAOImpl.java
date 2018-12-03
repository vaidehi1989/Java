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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {

		TypedQuery<Student> studentList = getSession().createQuery("from Student");

		return studentList.getResultList();
	}

	public boolean insertStudent(Student student) {

		Session session = getSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();

		return true;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
