package com.example.liquibasedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "v_student_report")
public class StudentReport {

  @Id
  private Long studentid;
  private String studentname;
  private Integer english;
  private Integer kannada;
  private Integer hindi;
  private Long total;

  // Getters and Setters
  public Long getStudentid() {
    return studentid;
  }

  public void setStudentid(Long studentid) {
    this.studentid = studentid;
  }

  public String getStudentname() {
    return studentname;
  }

  public void setStudentname(String studentname) {
    this.studentname = studentname;
  }

  public Integer getEnglish() {
    return english;
  }

  public void setEnglish(Integer english) {
    this.english = english;
  }

  public Integer getKannada() {
    return kannada;
  }

  public void setKannada(Integer kannada) {
    this.kannada = kannada;
  }

  public Integer getHindi() {
    return hindi;
  }

  public void setHindi(Integer hindi) {
    this.hindi = hindi;
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }
}
