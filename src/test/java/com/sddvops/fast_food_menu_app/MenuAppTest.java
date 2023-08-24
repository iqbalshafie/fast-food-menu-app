package com.sddvops.fast_food_menu_app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuAppTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRegisterUser() {
		MenuApp menuApp = new MenuApp();
		menuApp.registerUser("testuser", "password123", "test@example.com");

		User user = menuApp.authenticateUser("testuser", "password123");
		assertNotNull(user);
		assertEquals("testuser", user.getUsername());
		assertEquals("test@example.com", user.getEmail());
	}
//
//	@Test
//	void testAuthenticateUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testAddMenuItem() {
//		fail("Not yet implemented");
//	}

	@Test
	void testPlaceOrder() {
		User user = new User("testuser", "password123", "test@example.com");
		List<MenuItem> items = new ArrayList<>();
		// Populate items list with sample menu items
		// ...

		Order order = new Order(user, items);

		assertEquals(user, order.getUser());
		assertEquals(items, order.getItems());
		assertNotNull(order.getOrderTime());
		assertFalse(order.isPaid());
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
