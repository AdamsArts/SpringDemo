package com.mipl.project.Entity;

public class Laptop {

	private int productID;

	private String name;
	private int price;
	private String operatingSystem;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int productID, String name, int price, String operatingSystem) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.operatingSystem = operatingSystem;
	}

	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
