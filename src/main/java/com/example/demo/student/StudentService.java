package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	
	public List<Student> getStudents(){
		return repository.findAll();
	}
	
	
	
}
