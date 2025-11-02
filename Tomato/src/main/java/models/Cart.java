package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Restaurant restaurant;
    private List<MenuItem> items = new ArrayList<>();

    public Cart() {
        restaurant = null;
    }

    public void addItem(MenuItem menuItem) {
        if(restaurant == null) {
            System.err.println("Cart: Set a restaurant before adding items.");
            return;
        }
        items.add(menuItem);
    }

    public double getTotalCOst() {
        double sum = 0.0;
        for(MenuItem menuItem : items) {
            sum += Double.parseDouble(menuItem.getPrice());
        }
        return sum;
    }

    public boolean isEmpty() {
        return restaurant == null || items.isEmpty();
    }

    public void clearCart() {
        items.clear();
        restaurant = null;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
