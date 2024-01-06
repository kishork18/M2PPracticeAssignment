package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entiy.Student;
import com.example.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository sr;

	@Override
	public Student addStudent(Student student) {
		if(student==null) return null;
		return sr.save(student);
	}

	@Override
	public Student update(Student student) {
		Student s= getAllStudent().stream().filter(st->st.getRollNo()==student.getRollNo()).toList().get(0);
		if(s!=null) {
			s.setName(student.getName());
			s.setAddress(student.getAddress());
		    return sr.save(s);
		}
		 return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
