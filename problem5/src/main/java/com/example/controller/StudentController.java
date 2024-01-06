package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entiy.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
  private StudentService ss;
  @PostMapping("/add")
  public ResponseEntity<Student> addStudent(@RequestBody Student student){
	  Student s= ss.addStudent(student);
	  return new ResponseEntity<Student>(s, HttpStatus.CREATED);
	  
  }
  @PatchMapping("/update")
  public ResponseEntity<Student> updateStudent(@RequestBody Student student){
	  Student s= ss.update(student);
	  return new ResponseEntity<Student>(s, HttpStatus.OK);
  }
  @GetMapping("/allStudent")
  public ResponseEntity<List<Student>> getAll(){
	  List<Student> list= ss.getAllStudent();
	  return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
  }
}
