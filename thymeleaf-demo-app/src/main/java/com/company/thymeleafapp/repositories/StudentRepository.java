package com.company.thymeleafapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.thymeleafapp.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
