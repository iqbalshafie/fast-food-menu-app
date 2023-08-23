package com.sddvops.fast_food_menu_app;

public class FoodItem {
	private String name;
	private double price;

	public FoodItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " - $" + price;
	}
}