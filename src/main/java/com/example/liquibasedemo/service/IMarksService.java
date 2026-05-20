package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Mark;
import java.util.List;

public interface IMarksService {
  List<Mark> getAllMarks();

  Mark getMarkById(Long id);
}
