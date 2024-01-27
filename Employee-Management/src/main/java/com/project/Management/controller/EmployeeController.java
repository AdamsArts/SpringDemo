package com.project.Management.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		employeeService.addEmp(employee);
	}
	@PutMapping("/editemp/{id}")
	public void editEmployee(@RequestBody Employee employee,@PathVariable int id) {
		employeeService.editEmp(employee,id);
	}
	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getById(@PathVariable int id) {
		return employeeService.findByID(id);
	}
	@DeleteMapping("/deleterecord/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteRecord(id);
	}
	

}
