package com.company.thymeleafapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.company.thymeleafapp.models.Student;
import com.company.thymeleafapp.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/allstudents")
	public String getAll(Model model) {

		List<Student> students = studentService.getAll();
		model.addAttribute("students", students);

		String username = "Elvar";
		model.addAttribute("username", username);

		return "students";

//		return studentService.getAll();
	}

	@GetMapping("/onestudent")
	@ResponseBody
	public Optional<Student> getById(Integer id) {
		return studentService.getById(id);
	}

	@PostMapping(value = "/add")
	public String add(Student student) {
		studentService.add(student);
		return "redirect:/students/allstudent";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/students/allstudent";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		studentService.delete(id);
		return "redirect:/students/allstudent";
	}
}
