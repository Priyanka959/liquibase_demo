package com.example.liquibasedemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 100)
  private String name;

  @Column(name = "created_at", nullable = false, updatable = false)
  @JsonFormat(pattern = "yy-MM-dd")
  private LocalDateTime createdAt;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  @JsonManagedReference
  private List<Mark> marks;
}
