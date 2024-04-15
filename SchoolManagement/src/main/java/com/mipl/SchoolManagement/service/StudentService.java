package com.mipl.SchoolManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mipl.SchoolManagement.Repo.StudentRepo;
import com.mipl.SchoolManagement.entity.Student;

@Service
public class StudentService implements ServiceMethods {
	@Autowired
	private StudentRepo repo;

//	@Override
//	public Student getByStudentId(Integer id) {
//		// TODO Auto-generated method stub
//		return repo.findByStudentId(id);
//	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
	
	
	

	
	
	

}
