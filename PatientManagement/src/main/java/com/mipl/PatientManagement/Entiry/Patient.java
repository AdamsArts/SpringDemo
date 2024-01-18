package com.mipl.PatientManagement.Entiry;

public class Patient {
	
	private int id;
	private String name;
	private int age;
	private String[] diagnosis;
	private String[] Medications;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String[] diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public String[] getMedications() {
		return Medications;
	}
	public void setMedications(String[] medications) {
		Medications = medications;
	}
	public Patient(int id, String name, int age, String[] diagnosis, String[] medications) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.diagnosis = diagnosis;
		Medications = medications;
	}
	
	
	

}
