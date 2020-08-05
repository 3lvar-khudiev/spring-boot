package com.company.thymeleafapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.thymeleafapp.models.Student;
import com.company.thymeleafapp.repositories.StudentRepository;

@Service
public class StudentService {
		
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> getById(Integer id) {
		return studentRepository.findById(id);
	}
	
	public void add(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
}
