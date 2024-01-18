package com.mipl.PatientManagement.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mipl.PatientManagement.Entiry.Patient;

@Service
public class PatientService {

	public static List<Patient> patients = new ArrayList<>(Arrays.asList(new Patient(1, "Micheal", 25,
			new String[] { "Hypertension ", "Pneumonia" }, new String[] { "metoprolol", "amoxicillin" })));

	public static List<Patient> getPatients() {
		return patients;
	}

	public static String updateData(int id, Patient updatedData) {

		for (Patient patient : patients) {
			if (patient.getId() == id) {
				patient.setId(updatedData.getId());
				patient.setAge(updatedData.getAge());
				patient.setName(updatedData.getName());
				patient.setDiagnosis(updatedData.getDiagnosis());
				patient.setMedications(updatedData.getMedications());
				return "Patiend data updated successfully :)";
			}

		}

		return "Oops! Something went wrong, and it seems the record you are looking for cannot be found.";
	}

	public static Patient getPatient(int id) {
		for (Patient patient : patients) {
			if (patient.getId() == id) {
				return patient;
			}

		}

		return null;
	}

	public static String addPatient(Patient newPatient) {
		patients.add(newPatient);

		return "patient added";
	}

	public static String deletePatient(int id) {
		for (Patient patient : patients) {
			if (patient.getId()==id) {
				patients.remove(patient);
				return "Patient discharged successfully";
				
			}
		}
		return "Oops! Something went wrong, and it seems the record you are looking for cannot be found.";
	}

}
