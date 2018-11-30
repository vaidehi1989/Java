package com.bookstore.demos.profiles_jdbctemplating.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Student getStudent(int rno) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertStudent(Student student) {
		String query = "insert into student (name,marks) values( '" + student.getName() + "'," + student.getMarks()
				+ ")";
		jdbcTemplate.update(query);
		
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
