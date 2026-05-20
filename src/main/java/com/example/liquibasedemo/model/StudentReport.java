package com.example.liquibasedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

@Entity
@Immutable
@Table(name = "v_student_report")
@Getter
@Setter
public class StudentReport {

  @Id
  private Long studentid;
  private String studentname;

  @JsonFormat(pattern = "yy-MM-dd")
  private LocalDateTime createdAt;

  private Integer english;
  private Integer kannada;
  private Integer hindi;
  private Long total;
}
