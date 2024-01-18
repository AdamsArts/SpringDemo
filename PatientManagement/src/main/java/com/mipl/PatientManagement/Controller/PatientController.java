package com.mipl.PatientManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.PatientManagement.Entiry.Patient;
import com.mipl.PatientManagement.Service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@GetMapping("/list")
	public List<Patient> getPatients(){
		return PatientService.getPatients();
	}
	@PostMapping("/updatePatient/{id}")
	public String updatePatient(@PathVariable int id,@RequestBody Patient updatedData) {
		return PatientService.updateData(id,updatedData);
	}
	@PostMapping("/addPatient")
	public String addPatient(@RequestBody Patient newPatient) {
		return PatientService.addPatient(newPatient);
	}
	
	@GetMapping("/getPatient/{id}")
	public Patient getPatient(@PathVariable int id){
		return PatientService.getPatient(id);
		
	}
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable int id) {
		return PatientService.deletePatient(id);
	}

}
