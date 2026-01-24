// ----- Use Case Diagram------
 
// -------Receptionist---------
// Add / Update Table Chart
// Reserve Table
// Update / Cancel Reservation
// Login / Logout 

// -----Waiter-----
// Login / Logout
// Place Order -> Add Meal -> Add Order Item
// Update Order
// Issue Check
// View Order
// Process Payment

// -----------Manager-----------
// Add Menu -> Add Menu Section -> Add Menu Item
// Register / Cancel Account
// Modidy Menu -> Modify Menu Section -> Modidy Menu Item
// Print Menu
// All Work of Receptionist
// All Work of Waiter

// -------Cashier----------
// Process Payment

// --------Chef----------
// View Order

// --------Restaurant Design-----

class Restaurant {
    String name;
    List<Branch> restaurantBranches;
}

class Branch {
    String name;
    Address branchLocation;
    Menu menu;
    TableChart tableChart;
    Kitchen kitchen;
    List<Employee> employees;
}

class Address {
    String street;
    String pincode;
    String state;
    String city;
    String country;
}

class TableChart {
    int tableChartId;
    Image tableChartImage; // blob image type
}

class Kitchen {
    String name;
}

class Menu {
    int menuId;
    String title;
    String description;
    List<MenuSection> menuSections;
}

class MenuSection {
    int menuSectionId;
    String title;
    String description;
    List<MenuItem> menuItems;
}

class MenuItem {
    int menuItemId;
    String title;
    String description;
    double price;
}

// ----- Actors Design---

class Account {
    String id;
    String password;
    Address address;
    AccountStatus status;
}

class Person {
    String name;
    String email;
    String phone;
}

enum AccountStatus {
    Active, Closed, Canceled, BlackListed
}

class Employee extends Person {
    int employeeId;
    Account account;
    Date dateJoined;
}

class Chef extends Employee {

} 

class Waiter extends Employee {

}

class Manager extends Employee {

}

class Receptionist extends Person {

}

// -----Reservation Design-----

class Customer {
    Date lastVisited;
}

class Reservation {
    int reservationId;
    Date timeOfReservation;
    int peopleCount;
    ReservationStatus status;
    String notes;
    Date checkIn;
    Customer customer;
    int tableId;
}

enum ReservationStatus {
    Requested, Pending, Confirmed, Canceled, Checked-In, Abandoned
}

class Table {
    int tableId;
    TableStatus status;
    int maxCapacity;
    int locationIdentifier;
    List<TableSeat> tableSeats;
    List<Order> orders;
}

enum TableStatus {
    Free, Reserved, Occupied, Other
}

class TableSeat {
    int tableSeatNumber;
    SeatType type;
}

enum SeatType {
    Regular, Kid, Accessible, Other
}

// ---Notification for Reservation----

class Notification {
    int notificationId;
    Date createdOn;
    String content;
}

class PostalNotification extends Notification {

}

class EmaiNotifocation extends Notification {
    
}

// ----Order Design----

class Order {
    int orderId;
    OrderStatus status;
    List<Meal> meals;
}

enum OrderStatus {
    Received, Preparing, Completed, Canceled, None
}

class Meal {
    int mealId;
    MealItem mealItem;
}

class MealItem {
    int mealItemId;
    int quantity;
}

// ----Payment Design For Order----

class Bill {
    int billId;
    int orderId;
    double amount;
    double tip;
    double tax;
    boolean isPaid;
    int paymentId;
}

class Payment {
    int paymentId;
    double amount;
    PaymentStatus status;
    Date creationDate;
}

enum PaymentStatus {
    Upaid, Pendingm Completed, Failed, Declined, Canceled, Abandoned, Settling, Settled, Refunded
}

class CreditCaerdTransaction extends Payment {

}

class CashTransaction extends Payment {

}


