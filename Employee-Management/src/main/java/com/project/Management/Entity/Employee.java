package com.project.Management.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee implements Serializable {
	public static final long serialVersionUID=1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private long salary;
	
	
	

}
