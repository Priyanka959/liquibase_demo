package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Student;
import java.util.List;

public interface IStudentService {
  List<Student> getAllStudents();

  Student getStudentById(Long id);
}
