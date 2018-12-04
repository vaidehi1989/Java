package com.bookstore.springmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.bookstore.springmvc.model.Student;

public class StudentRestTest {

	public RestTemplate getRest() {
		RestTemplate rest = new RestTemplate();

		ClientHttpRequestInterceptor ri = new TestInterceptor();
		List<ClientHttpRequestInterceptor> ris = new ArrayList<ClientHttpRequestInterceptor>();
		ris.add(ri);
		rest.setInterceptors(ris);
		rest.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

		return rest;
	}

	public void testGetStudentById() {
		String url = "http://localhost:8080/bookstore_spring/student/121";
		Student student = getRest().getForObject(url, Student.class);
		System.out.println(student);

	}

	public void testGetAllStudents() {
		String url = "http://localhost:8080/bookstore_spring/student";
		List<Map<String, Object>> list = getRest().getForObject(url, List.class);

		for (Map m : list) {

			System.out.println(m.get("rno") + "\t" + m.get("name") + "\t" + m.get("marks") + "\t");
			System.out.println("-------------------------");
		}
	}

	public static void main(String[] args) {
		StudentRestTest test = new StudentRestTest();

		// test.testGetStudentById();

		test.testGetAllStudents();
	}

}
