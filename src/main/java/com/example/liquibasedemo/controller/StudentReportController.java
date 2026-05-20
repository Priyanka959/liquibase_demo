package com.example.liquibasedemo.controller;

import com.example.liquibasedemo.model.StudentReport;
import com.example.liquibasedemo.repository.StudentReportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class StudentReportController {

  private final StudentReportRepository studentReportRepository;

  public StudentReportController(StudentReportRepository studentReportRepository) {
    this.studentReportRepository = studentReportRepository;
  }

  @GetMapping("/students")
  public List<StudentReport> getStudentReport() {
    return studentReportRepository.findAll();
  }
}
