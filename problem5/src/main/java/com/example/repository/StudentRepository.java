package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entiy.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
  public Optional<Student> findByRollNo(int rollNo);
}
