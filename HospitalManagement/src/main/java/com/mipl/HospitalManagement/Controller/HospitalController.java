package com.mipl.HospitalManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.HospitalManagement.Entity.Hospital;
import com.mipl.HospitalManagement.Service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/gethospitallist")
	public ResponseEntity<Hospital> getHospitalsList(){
		return HospitalService.getHospitalList();
	}
	@PostMapping("/addhospital")
	public ResponseEntity<?> addHospital(@RequestBody Hospital hospital){
		return HospitalService.addHospital(hospital);
	}
}
