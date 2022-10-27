package slash.code.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
        CreditCard card;


    @Override
    public void pay(int amount) {

        System.out.println("Paying amount :"+amount+" using credit card");
        card.setAmount(card.getAmount()-amount);

    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        card=new CreditCard("cardNumber","expirationDate","cvv");

    }
}
