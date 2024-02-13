package com.mipl.HospitalManagement.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String hospitalName;
	private String city;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Hospital(int id, String hospitalName, String city, String state) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.city = city;
		this.state = state;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
