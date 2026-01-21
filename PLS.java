// -----Use Case Diagram------

// ----Parking Attendant-----
// View Account
// Update Account
// Login/Logout
// Cash Payment

// -----Customer-----
// All Works of Parking Attendant
// Take Ticket
// Scan Ticket
// Pay Ticket
// Credit Card Payment

//-------Admin-------- 
// All Works of Parking Attendant
// Add Parking Floor -> Add parking Display board
// Add Parking Spot -> Add Electric Panel
// Add Parking Attendant
// Add/Modify Parking RAte
// Add entrance / exit panel

//-------System------- 
// Assign a parking sport to a vehicle
// Remove a vehicle from a parking spot
// Show Parking full message
// Show available parking spot messages


// ---Parking---

class ParkingLot {
    String id;
    Address address;
    List<ParkingFloor> parkingFloors;
    List<EntrancePanel> entrancePanels;
    List<ExitPanel> exitPanels;
    List<ParkingAttendantPortal> parkingAttendants;
    List<ParkingTicket> parkingTickets;
}

class Address {
    String streetAddress;
    String city;
    String pincode;
    String state;
    String country;
}

class ParkingFloor {
    String name;
    List<ParkingSpot> parkingSpots;
    ParkingDisplayBoard parkingDisplayBoard;
    List<CustomerInfoPoral> customeInfos;
}

class ParkingSpot {
    String name;
    boolean free;
    ParkingSpotType type;
    Vehicle vehicle;
}

enum ParkingSpotType {
    Handicapped, Compact, Large, Mototbike, Electric
}

class HandicappedSpot extends ParkingSpot {

}

class CompactSpot extends ParkingSpot {

}

class LargeSpot extends ParkingSpot {

}

class MototbikeSpot extends ParkingSpot {

}

class ElectricSpot extends ParkingSpot {
    ElectricPanel electricPanel;
}

class ElectricPanel {
    int payedForMinutes;
    Date chargingStartTime;
}


class Vehicle {
    String licenseNumber;
    VehicleType type;
    ParkingTicket parkingTicket;
}

enum VehicleType {
    Car, Truck, Electric, Van, Mototbike
}

class Car extends Vehicle {

}

class Truck extends Vehicle {

}

class Electric extends Vehicle {

}

class Van extends Vehicle {

}

class Mototbike extends Vehicle {

}

class ParkingDisplayBoard {
    String id;
    HandicappedSpot handicappedFreeSpot;
    CompactSpot compactFreeSpot;
    LargeSpot largeFreeSpot;
    MototbikeSpot motorbikeFreeSpot;
    ElectricSpot electricFreeSpot;
}

class CustomerInfoPoral {
    String id;
}

class EntrancePanel {
    String id;
}

class ExitPanel {
    String id;
}

class ParkingAttendantPortal {
    Sting id;
}

// -----Parking Ticket------

class ParkingTicket {
    String ticketNumber;
    Date issuedAt;
    Date payedAt;
    double payedAmount;
    ParkingTicketStatus status;
    Payment payment;
}

enum ParkingTicketStatus {
    Active, Paid, Lost
}

// ---Payment---

class Payment {
    Date creationDate;
    double amount;
    PaymentStatus status;
}

enum PaymentStatus {
    Unpaid, Pending, Completed, Failed, Declined, Cancelled
}

class CreditCardTransaction extends Payment {

}

class CashTransaction extends Payment {

}

// --Actors---

class Account {
    String userName;
    String password;
    AccountStatus status;
}

enum AccountStatus {
    Active, Closed, Cancelled, Blacklisted, None
}

class Admin extends Account {

}

class parkingAttendant extends Account {

}