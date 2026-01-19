// USE CASE DIAGRAM

// Member
// Search Catlog -> Search By book title, author name, subject name, publication date
// cancel Membership
// Register / Update Account
// Login / Logout
// Checkout book
// Remove reservation
// Renew Book 
// Reserve Book
// View Account
// Return Book -> Pay fine

// Librarian
// All works of member
// Add Book > Add Book Item  > Update Catalog
// Remove Book----> Remove book Item-----|
// Edit Book -> Edit book Item-----------|
// Issue Book
 
// Notification 
// Send Overdue notification
// Send reservation available notification
// Send reservation cancelled notification

// -- Library Entities
class Address {
    String streetAddress;
    String city;
    String state;
    String pincode;
    String country;
}

class Library {
    String name;
    Address address;
    List<BookItem> bookItems;
}

enum BookFormat {
    Hardcover, Paperback, Audiobook, Ebook, NewsPaper, Magazine, Journal
}

enum BookStatus {
    available, reserved, loaned, lost
}

class BookItem extends Book {
    String barcode;
    boolean isReferenceOnly;
    Date borrowed;
    Date dueDate;
    Double price;
    BookFormat format;
    BookStatus bookStatus;
    Date dateOfPurchase;
    Date publicationDate;
}

class Rack {
    int number;
    String locationIdentifier;
}

class Book {
    String ISBN;
    String title;
    String subject;
    String publisher;
    String language;
    int nuberOfPages;
    List<Author> authors;
}

class Author {
    String name;
    String description;
}

// User Entities

class Librarian extends Account {

}

class Account {
    String id;
    String password;
    AccountStatus status;
    Person person;
    LibraryCard libraryCard;
}

class LibraryCard {
    String barcode;
    String cardNumber;
    Date issuedAt;
    boolean isActive;
}

class BarcodeReader {
    String id;
    Date registeredAt;
    boolean isActive;
}

enum AccountStatus {
    Active, Closed, Cancelled, Blacklisted, None
}

class person {
    String name;
    String email;
    Address address;
    String phone;
}

class Member extends Account {

}

// Book Reservation entities

class BookReservation {
    Date creationDate;
    ReservationStatus reservation;
    BookItem bookItem;
}

class BookLending {
    Date creationDate;
    Date dueDate;
    Date returnDate;
}

class Fine extends FineTransaction {
    double amount;
}

class FineTransaction {
    Date creationDate;
    double amount;
}

class CreditCardTransaction extends FineTransaction {

}

class CheckTransaction extends FineTransaction {

}

class CashTransaction extends FineTransaction {

}


// Search Entities

class Catalog implements Search {
    Date creationDate;
    int totalBooks;
    Map<String, List<Book>> bookTitles;
    Map<String, List<Book>> bookAuthors;
    Map<String, List<Book>> bookSubjects;
    Map<Date, List<Book>> bookPublicationDate;
}

class Search {

}

// Notification Entities

class Notification {
    int notificationId;
    Date creationDate;
    String content;
}

class PostalNotification extends Notification {

}

class EmailNotification extends Notification {
    
}