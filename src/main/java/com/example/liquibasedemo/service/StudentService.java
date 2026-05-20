package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Student;
import com.example.liquibasedemo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import java.util.List;

@Service
@Transactional
public class StudentService implements IStudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll(Sort.by("name").ascending());
  }

  @Override
  public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
  }
}
