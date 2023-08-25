package com.sddvops.fast_food_menu_app;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MenuApp {
    private List<User> users;
    private List<MenuItem> menuItems;
    private List<Order> orders;

    public MenuApp() {
        users = new ArrayList<>();
        menuItems = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void registerUser(String username, String password, String email) {
        User newUser = new User(username, password, email);
        users.add(newUser);
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // User not found
    }

    // Other user and authentication methods

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void placeOrder(User user, List<MenuItem> items) {
        Order newOrder = new Order(user, items);
        orders.add(newOrder);
        // Process payment and update order status
    }

    // Other order and menu management methods
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Fast Food Restaurant Menu!");
		System.out.println("1. Burger");
		System.out.println("2. Fries");
		System.out.println("3. Soda");
		System.out.println("4. Ice Cream");
		System.out.println("5. Happy Meal");

		System.out.print("Enter the number of your choice: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("You selected Burger");
			break;
		case 2:
			System.out.println("You selected Fries");
			break;
		case 3:
			System.out.println("You selected Soda");
			break;
		case 4:
			System.out.println("You selected Ice Cream");
			break;
		case 5:
			System.out.println("You selected Happy Meal");
			break;
		default:
			System.out.println("Invalid choice");
		}

		scanner.close();
	}

	public void testMain() {
		// TODO Auto-generated method stub
		
	}
}