package com.mipl.Employee.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mipl.Employee.Entity.Employee;

@Service
public class EmpService {

	public static List<Employee> employees = new ArrayList<>(
			Arrays.asList(new Employee(1, "Adam", "Developer"), new Employee(2, "Madhu", "Developer")));

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

	public static String deleteById(int id) {

		for (Employee employee : employees) {
			if (employee.getEmp_Id() == id) {
				employees.remove(employee);
				return employee.getEmp_Name() + "'s Record deleted successfully";
			}

		}

		return "Record not found";
	}

	public static String updateEmpById(Employee updatedEmp, int id) {
		
		for (Employee employee : employees) {
			if (employee.getEmp_Id() == id) {
				employee.setEmp_Id(updatedEmp.getEmp_Id());
				employee.setEmp_Name(updatedEmp.getEmp_Name());
				employee.setEmp_role(updatedEmp.getEmp_role());
				return "Record updated";
			}
		}
		
		return "Oops Record not found!!!";
	}

}
