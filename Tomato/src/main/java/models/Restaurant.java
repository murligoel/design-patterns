package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int nextRestaurantId = 0;
    private int restaurantId;
    private String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String location;
    private List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.restaurantId = nextRestaurantId++;
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menu;
    }

}