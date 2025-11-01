package models.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " to card " + cardNumber);
    }
}
