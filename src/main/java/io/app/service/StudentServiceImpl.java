package io.app.service;

import io.app.model.Student;
import io.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repository;
	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll(Sort.by("id").descending());
	}
}
