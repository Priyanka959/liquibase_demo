package com.example.liquibasedemo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 100)
  private String name;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  @com.fasterxml.jackson.annotation.JsonManagedReference 
  private List<Mark> marks;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Mark> getMarks() {
    return marks;
  }

  public void setMarks(List<Mark> marks) {
    this.marks = marks;
  }
}
