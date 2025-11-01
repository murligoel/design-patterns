package models.strategies;

public class UpiPaymentStrategy implements PaymentStrategy {

    private String mobile;

    public  UpiPaymentStrategy(String mobile) {
        this.mobile = mobile;
    }
    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " using mobile " + mobile);
    }
}
