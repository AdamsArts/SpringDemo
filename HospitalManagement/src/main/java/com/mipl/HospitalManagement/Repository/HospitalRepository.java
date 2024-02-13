package com.mipl.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipl.HospitalManagement.Entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
