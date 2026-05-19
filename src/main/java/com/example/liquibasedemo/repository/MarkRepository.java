package com.example.liquibasedemo.repository;

import com.example.liquibasedemo.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
