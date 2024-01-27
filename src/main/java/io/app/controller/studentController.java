package io.app.controller;

import io.app.model.Student;
import io.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class studentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public String add(@RequestBody Student student){
		studentService.saveStudent(student);
		return "New Student is Added";
	}

	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentService.getAllStudents();
	}


}


