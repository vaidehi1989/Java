package com.bookstore.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bookstore.springmvc.model.Student;
import com.bookstore.springmvc.service.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService service;

	// -------------------Retrieve All Students------------------------------

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> listAllStudents() {
		List<Student> students = service.getAllStudents();
		if (students.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	// -------------------Retrieve Single Student ---------------------

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
		System.out.println("Fetching Student with id " + id);
		Student Student = service.findStudentById(id);
		if (Student == null) {
			System.out.println("Student with id " + id + " not found");
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(Student, HttpStatus.OK);
	}

	// -------------------Create a Student --------------------------------

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ResponseEntity<Void> createStudent(@RequestBody Student Student, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating Student " + Student.getName());

		if (service.isStudentExist(Student)) {
			System.out.println("A Student with name " + Student.getName() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		service.insertStudent(Student);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/Student/{id}").buildAndExpand(Student.getRno()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update a Student--------------------------------

	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		System.out.println("Updating Student " + id);

		if (service.isStudentExist(student)) {

			Student currentStudent = service.findStudentById(id);

			currentStudent.setName(student.getName());
			currentStudent.setMarks(student.getMarks());
			currentStudent.setRno(student.getRno());

			System.out.println(service.updateStudent(currentStudent));
			return new ResponseEntity<Student>(currentStudent, HttpStatus.OK);

		}
		System.out.println("Student with id " + id + " not found");
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);

	}

	// ------------------- Delete a Student----------------------------

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id) {
		System.out.println("Fetching & Deleting Student with id " + id);

		Student Student = service.findStudentById(id);
		if (Student == null) {
			System.out.println("Unable to delete. Student with id " + id + " not found");
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}

		service.deleteStudentById(id);
		return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
	}

}
