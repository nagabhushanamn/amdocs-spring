package com.model;

public class FoodItem {

	private String name;
	private double price;
	private FoodType type;

	public FoodItem(String name, double price, FoodType type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	

}
