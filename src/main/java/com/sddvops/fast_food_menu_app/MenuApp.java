package com.sddvops.fast_food_menu_app;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fast Food Restaurant Menu!");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Soda");
        // Add more menu items here

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
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}