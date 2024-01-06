package com.example.service;

import java.util.List;

import com.example.entiy.Student;

public interface StudentService {
 public Student addStudent(Student student);
 public Student update(Student student);
 public List<Student> getAllStudent();
}
