package com.example.liquibasedemo.service;

import com.example.liquibasedemo.model.Mark;
import com.example.liquibasedemo.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MarkService {

  private final MarkRepository markRepository;

  public MarkService(MarkRepository markRepository) {
    this.markRepository = markRepository;
  }

  public List<Mark> getAllMarks() {
    return markRepository.findAll(org.springframework.data.domain.Sort.by("score").ascending());
  }

  public Mark getMarkById(Long id) {
    return markRepository.findById(id).orElse(null);
  }
}
