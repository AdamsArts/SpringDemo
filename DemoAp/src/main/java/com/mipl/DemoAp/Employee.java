package com.mipl.DemoAp;

public class Employee {
	private String name;
	private int empNo;
	private String role;
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hii This is "+name+" Employee id is "+empNo+" And i am working in "+role+" role");
		

	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empNo, String role) {
		super();
//		System.out.println("This output from Constructor");
		this.name = name;
		this.empNo = empNo;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
//		System.out.println("This output from setters methods");
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
