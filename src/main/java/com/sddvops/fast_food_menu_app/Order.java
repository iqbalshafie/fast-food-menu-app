package com.sddvops.fast_food_menu_app;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private User user;
    private List<MenuItem> items;
    private LocalDateTime orderTime;
    private boolean paid;

    public Order(User user, List<MenuItem> items) {
        this.user = user;
        this.items = items;
        this.orderTime = LocalDateTime.now();
        this.paid = false;
    }

    // Getters and setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}

