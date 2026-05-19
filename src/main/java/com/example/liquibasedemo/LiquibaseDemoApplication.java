package com.example.liquibasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LiquibaseDemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(LiquibaseDemoApplication.class, args);
  }
}
