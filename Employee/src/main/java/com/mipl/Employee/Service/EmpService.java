package com.mipl.Employee.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mipl.Employee.Entity.Employee;

@Service
public class EmpService {

	public static List<Employee> employees = new ArrayList<>();
	
//	Arrays.asList(new Employee(1, "Adam", "Developer"), new Employee(2, "Madhu", "Developer"))

	public static List<Employee> listOfEmployees() {

		return employees;
	}

	public static Employee findById(int eid) {

		for (Employee employee : employees) {
			if (employee.getEmp_Id() == eid) {
				return employee;
			}

		}

		return null;
	}

	public static String insertEmp(Employee employee) {
		employees.add(employee);
		String res = "Record added with employee ID :" + employee.getEmp_Id();
		return res;
	}

	public static String insertEmpByStream(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
