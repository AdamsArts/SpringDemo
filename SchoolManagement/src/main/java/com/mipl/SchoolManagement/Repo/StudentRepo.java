package com.mipl.SchoolManagement.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipl.SchoolManagement.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//	public Student findByStudentId(Integer id);
}
