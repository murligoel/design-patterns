package managers;

import models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private List<Restaurant>  restaurants = new ArrayList<>();
    private static RestaurantManager instance = null;

    private RestaurantManager() {

    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String location) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            String rl = restaurant.getLocation().toLowerCase();
            if(rl.equals(location.toLowerCase())) {
                result.add(restaurant);
            }
        }
        return result;
    }
}
