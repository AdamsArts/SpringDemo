package com.project.Management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Management.Entity.Employee;
import com.project.Management.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	
	public void addEmp(Employee employee) {
		Employee empEntity=new Employee();
		
		employeeRepo.save(employee);
		
	}
	
	

}
