package com.mipl.SchoolManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.SchoolManagement.entity.Student;
import com.mipl.SchoolManagement.service.StudentService;



//@RestController
@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
    public String index() {
        return "index"; // This will return index.html from the templates directory
    }
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
//	@GetMapping("/getstudentbyid/{id}")
//	public ResponseEntity<?> getStudent(@PathVariable int id){
////		return service.getStudent(id);
//		return null;
//		}
	
	
	
}
