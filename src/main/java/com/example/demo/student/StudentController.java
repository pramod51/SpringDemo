package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}

	@PostMapping("/addStudent")
	public Student addStudent(Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return studentService.getStudents();
	}
	

}
