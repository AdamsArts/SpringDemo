package com.mipl.HospitalManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mipl.HospitalManagement.Entity.Hospital;
import com.mipl.HospitalManagement.Repository.HospitalRepository;

@Service
public class HospitalService {
	@Autowired
	private HospitalRepository hospitalRepository;

	public static ResponseEntity<Hospital> getHospitalList() {
		
		
		
		

		return null;
	}

	public static ResponseEntity<?> addHospital(Hospital hospital) {
		
		
//		HospitalRepository.save();
		return null;
	}

}
