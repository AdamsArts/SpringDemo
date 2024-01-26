package com.project.Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Management.Entity.Employee;
import com.project.Management.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/addemp")
	public void addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		employeeService.addEmp(employee);
	}
	

}
