package com.jsp.demo.DemoApp;


public class Car {
	private String brand;
	private int price;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car as been started");
	}
	public Car() {
		// TODO Auto-generated method stub
		System.out.println("Car class constructor");

	}
	

}
