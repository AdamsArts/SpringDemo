package com.mipl.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.Employee.Entity.Employee;
import com.mipl.Employee.Service.EmpService;

@RestController
@RequestMapping("/Employee")
public class EmpController {

	@GetMapping("/employeeList")
	public List<Employee> employees() {

		return EmpService.listOfEmployees();
	}

	@GetMapping("getEmployee/{id}")
	public Employee findEmpById(@PathVariable("id") int id) {

		return EmpService.findById(id);
	}

	@DeleteMapping("deleteEmployee/{id}")
	public String deleteEmpById(@PathVariable int id) {

		return EmpService.deleteById(id);
	}

	@PostMapping("updateEmployee/{id}")
	public String updateEmployeeById(@RequestBody Employee updatedEmp, @PathVariable int id) {
		return EmpService.updateEmpById(updatedEmp, id);
	}

	@PostMapping("/addemp")
	public String addEmployee(@RequestBody Employee employee) {

		return EmpService.insertEmp(employee);
	}

}
