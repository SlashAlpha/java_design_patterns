package slash.code.strategy;

public class PaymentByPaypal implements PaymentStrategy{

    String email;
    String password;




    @Override
    public void pay(int amount) {


        System.out.println("Paying amount : "+amount+"using Paypal");

    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        email="...";
        password="...";
    }
}
