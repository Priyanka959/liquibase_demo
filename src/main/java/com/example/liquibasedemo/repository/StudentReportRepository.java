package com.example.liquibasedemo.repository;

import com.example.liquibasedemo.model.StudentReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReportRepository extends JpaRepository<StudentReport, Long> {
}
