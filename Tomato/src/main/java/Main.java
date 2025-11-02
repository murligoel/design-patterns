import models.Order;
import models.Restaurant;
import models.User;
import strategies.UpiPaymentStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TomatoApp tomatoApp = new TomatoApp();

        User user = new User(101, "Aditya", "Delhi");
        System.out.println("User: " + user.getName() + " is active.");

        List<Restaurant> restaurantList = tomatoApp.searchRestaurant("Delhi");

        if( restaurantList.isEmpty() ) {
            System.out.println("No Restaurant found.");
            return;
        }

        System.out.println("Restaurant found: ");
        for(Restaurant restaurant : restaurantList) {
            System.out.println(restaurant.getName());
        }

        tomatoApp.selectRestaurant(user, restaurantList.get(0));
        System.out.println("Selected restaurant: " + restaurantList.get(0).getName());


        tomatoApp.addToCart(user, "P1");
        tomatoApp.addToCart(user, "P2");

        tomatoApp.printUserCart(user);

        Order order = tomatoApp.checkOutNow(user, "Delivery", new UpiPaymentStrategy("1234567890"));

        tomatoApp.payForOrder(user, order);
    }
}
