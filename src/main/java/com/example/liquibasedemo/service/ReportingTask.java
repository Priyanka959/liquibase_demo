package com.example.liquibasedemo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class ReportingTask {

  private final StudentService studentService;

  public ReportingTask(StudentService studentService) {
    this.studentService = studentService;
  }

  // Runs every 60 seconds (60000 ms)
  @Scheduled(fixedRate = 60000)
  public void reportStudentCount() {
    int count = studentService.getAllStudents().size();
    System.out.println("Scheduled Task Executed at: " + LocalDateTime.now() +
        " | Total Students: " + count);
  }
}
