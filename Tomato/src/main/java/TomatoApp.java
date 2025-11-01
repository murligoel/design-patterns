import managers.RestaurantManager;
import models.*;
import strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class TomatoApp {

    public TomatoApp() {
        initializeRestaurants();
    }

    private void initializeRestaurants() {

        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenuItem(new MenuItem("P1", "Chole Bhature", "120"));
        restaurant1.addMenuItem(new MenuItem("P2", "Samosa", "15"));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenuItem(new MenuItem("P1", "Raj Kachori", "80"));
        restaurant2.addMenuItem(new MenuItem("P2", "Pav Bhaji", "100"));
        restaurant2.addMenuItem(new MenuItem("P3", "Dhokla", "50"));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant3.addMenuItem(new MenuItem("P1", "Masala Dosa", "90"));
        restaurant3.addMenuItem(new MenuItem("P2", "Idli Vada", "60"));
        restaurant3.addMenuItem(new MenuItem("P3", "Filter Coffee", "30"));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }

    public List<Restaurant> searchRestaurant(String location) {
        return RestaurantManager.getInstance().searchByLocation(location.toLowerCase());
    }

    public void selectRestaurant(User user, Restaurant restaurant) {
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user, String itemCode) {
        Restaurant restaurant = user.getCart().getRestaurant();
        if (restaurant == null) {
            System.out.println("Please select a restaurant first.");
            return;
        }
        for(MenuItem item : restaurant.getMenuItems()) {
            if(item.getCode().equals(itemCode)) {
                user.getCart().addItem(item);
                break;
            }
        }
    }

    public Order checkOutNow(User user, String orderType, PaymentStrategy paymentStrategy) {
        return checkout(user, orderType, paymentStrategy, new NowOrderFactory());
    }
}
