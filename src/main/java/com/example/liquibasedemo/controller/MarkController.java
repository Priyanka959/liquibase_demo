package com.example.liquibasedemo.controller;

import com.example.liquibasedemo.model.Mark;
import com.example.liquibasedemo.service.MarkService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marks")
public class MarkController {

  private final MarkService markService;

  public MarkController(MarkService markService) {
    this.markService = markService;
  }

  @GetMapping
  public List<Mark> getAllMarks() {
    return markService.getAllMarks();
  }

  @GetMapping("/{id}")
  public Mark getMarkById(@PathVariable Long id) {
    return markService.getMarkById(id);
  }
}
