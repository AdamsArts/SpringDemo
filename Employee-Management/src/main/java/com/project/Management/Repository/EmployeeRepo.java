package com.project.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Management.Entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
