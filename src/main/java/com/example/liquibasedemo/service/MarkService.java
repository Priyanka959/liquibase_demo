package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Mark;
import com.example.liquibasedemo.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import java.util.List;

@Service
@Transactional
public class MarkService implements IMarksService {

  @Autowired
  private MarkRepository markRepository;

  @Override
  public List<Mark> getAllMarks() {
    return markRepository.findAll(Sort.by("score").ascending());
  }

  @Override
  public Mark getMarkById(Long id) {
    return markRepository.findById(id).orElse(null);
  }
}
