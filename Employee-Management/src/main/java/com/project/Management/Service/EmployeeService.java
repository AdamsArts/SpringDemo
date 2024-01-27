package com.project.Management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Management.Entity.Employee;
import com.project.Management.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	
	public void addEmp(Employee employee) {
		employeeRepo.save(employee);
		
	}


	public void editEmp(Employee employee,int id) {
		
			Optional<Employee> eid=employeeRepo.findById(id);
			
			if(eid.isPresent()) {
				Employee e=eid.get();
//				e.setId(employee.getId());
				e.setName(employee.getName());
				e.setDesignation(employee.getDesignation());
				e.setSalary(employee.getSalary());
				employeeRepo.save(e);
				
			}
			
	
			
		
		
		
	}


	public Optional<Employee> findByID(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
		
	}


	public void deleteRecord(int id) {
		Optional<Employee> eid=employeeRepo.findById(id);
		
		if(eid.isPresent()) {
			Employee e=eid.get();
			employeeRepo.delete(e);
		}
		
	}
	
	

}
