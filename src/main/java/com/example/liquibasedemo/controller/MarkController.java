package com.example.liquibasedemo.controller;

import com.example.liquibasedemo.model.Mark;
import com.example.liquibasedemo.service.IMarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marks")
public class MarkController {

  @Autowired
  private IMarksService markService;

  @GetMapping
  public List<Mark> getAllMarks() {
    return markService.getAllMarks();
  }

  @GetMapping("/{id}")
  public Mark getMarkById(@PathVariable Long id) {
    return markService.getMarkById(id);
  }
}
