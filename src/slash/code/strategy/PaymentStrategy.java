package slash.code.strategy;

public interface PaymentStrategy {
    void pay(int amount);
    boolean validatePaymentDetails();
    void collectPaymentDetails();

}
