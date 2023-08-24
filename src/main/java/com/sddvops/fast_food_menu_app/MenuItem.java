package com.sddvops.fast_food_menu_app;

public class MenuItem {
	private String name;
	private String description;
	private double price;

	public MenuItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	// Getters and setters

	public MenuItem(FoodItem foodItem, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Object getFoodItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
}
