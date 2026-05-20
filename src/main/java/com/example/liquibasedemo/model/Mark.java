package com.example.liquibasedemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "marks")
@Getter
@Setter
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
}
