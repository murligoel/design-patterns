// USE CASE DIAGRAM
 
// ---Guest---
// Search Movie (title, genere, language, release date, city name)
 
// ----Customer extends Guest---
// Login Logout Reset password
// Create Booking -> Assign Seat
// Make Payment -> Apply Coupon
// View Booking
// Cancel Booking -> Refund Payment And Send Notification
 
// ---Admin----
// Add Movie
// Modify Movie
// Add show
// Modify Show
// Cancel Show
 
// -----FrontDeskOfficer----
// Same Responsibilities as Guest and Customer

// ----System----
// Send Booking Notification
// Send new Movie Notification

// ------ Movie Hall --------
class Cinema {
    String name;
    int totalCinemas;
    Address location;
    List<CinemaHall> totalCinemas; 
}

class Address {
    String streetAddress;
    String city;
    String state;
    String zipcode;
    String county;
}

class CinemaHall {
    String name;
    int totalSeats;
    List<CinemaHallSeat> CinemaHallSeats;
    List<Show> shows;
}

class CinemaHallSeat {
    int seatRow;
    int seatCol;
    SeatType type;
}

enum SeatType {
    Regular, Premium, Accessible, EmergencyExit, Other
}

class Show {
    Date createdOn;
    Date startTime;
    Date endTime;
    Movie movie;
}

class Movie {
    String title;
    String description;
    int durationInMins;
    String langauge;
    Date releaseDate;
    String county;
    String genre;
    List<Show> shows;
}

// -----Actors-------

class Person {
    String name;
    Address address;
    String email;
    String phone;
    Account account;
}

class Account {
    String id;
    String password;
    AccountStatus status;
}

enum AccountStatus {
    Active, Closed, Cancelled, Blacklisted, Blocked
}

class Admin extends Person {

}

class Customer extends Person {

}

class FrontDeskOfficer extends Person {

}


// ------Search------

class Catalog {
    Date lastUpdatedDate;
    Map<String, List<Movie>> movieTitles;
    Map<String, List<Movie>> movieLanguages;
    Map<String, List<Movie>> movieGenres;
    Map<String, List<Movie>> movieReleaseDates;
    Map<String, List<Movie>> movieCities;
}

interface Search {
// Search Movie (title, genere, language, release date, city name)
}

//----Booking Entitties---

class Booking  {
    String bookingNumber;
    int numberOfSeats;
    Date createdOn;
    Show show;
    List<ShowSeat> showSeats;
    BookingStatus status;
}

class ShowSeat extends CinemaHallSeat {
    int seatNumber;
    boolean isReserved;
    double price;
}

enum BookingStatus {
    Requested, Pending, Confirmed, Checked-in, Cancelled, Abandoned
}

// ---Payment---

class Payment {
    double amount;
    Date createdOn;
    PaymentStatus status;
    int transactionId;
    Coupon coupon;
}

enum PaymentStatus {
    Unpaid, Pending, Completed, Failed, Declined, Cancelled, Abandoned, Settling, Settled, Refunded
}

class Coupon {
    int id;
    double balance;
    Date expiry;
}

class CreditCardTransaction extends Payment {

}

class CashTransaction extends Payment {

}

// ----Notification---

class Notification {
    int notificationId;
    Date creationDate;
    String content;
}

class EmailNotification extends Notification {

}

class SmsNotification extends Notification {
    
}