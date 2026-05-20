package com.example.liquibasedemo.controller;

import com.example.liquibasedemo.model.Student;
import com.example.liquibasedemo.service.IStudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

  @Autowired
  private IStudentService studentService;

  @GetMapping
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Long id) {
    return studentService.getStudentById(id);
  }
}
