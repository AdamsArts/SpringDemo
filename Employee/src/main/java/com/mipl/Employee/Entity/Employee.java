package com.mipl.Employee.Entity;

public class Employee {
	
	private int emp_Id;
	private String emp_Name;
	private String emp_role;
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_role() {
		return emp_role;
	}
	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_Id, String emp_Name, String emp_role) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_role = emp_role;
	} 
	
	
	
	
	

}
