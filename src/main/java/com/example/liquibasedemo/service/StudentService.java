package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Student;
import com.example.liquibasedemo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getAllStudents() {
    return studentRepository.findAll(org.springframework.data.domain.Sort.by("name").ascending());
  }

  public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
  }
}
