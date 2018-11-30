package com.bookstore.demos.profiles_jdbctemplating;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.demos.profiles_jdbctemplating.model.Student;
import com.bookstore.demos.profiles_jdbctemplating.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public ModelAndView addstudent() {
		ModelAndView mv = new ModelAndView("addstudent");
		mv.addObject("student", new Student());
		return mv;
	}

	@RequestMapping(value = "/insertstudent", method = RequestMethod.POST)
	public ModelAndView insertStudent(@Valid Student student, BindingResult bindingResult) {
		ModelAndView mv = new ModelAndView("index");
		System.out.println("controller called");
		if (bindingResult.hasErrors()) {
			System.out.println("Errors in form");
			mv.setViewName("addstudent");
			mv.addObject(student);
			return mv;
		}
		service.insertStudent(student);
		return mv;
	}

	@RequestMapping(value = "/studentdetails", method = RequestMethod.GET)
	public ModelAndView getAllStudents() {
		List<Student> studentsList = service.getAllStudents();

		ModelAndView mv = new ModelAndView("studentdetails");
		mv.addObject("studentList", studentsList);

		return mv;
	}

}
