package com.example.liquibasedemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marks")
public class Mark {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  @com.fasterxml.jackson.annotation.JsonBackReference
  private Student student;

  @Column(length = 50)
  private String subject;

  private Integer score;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }
}
