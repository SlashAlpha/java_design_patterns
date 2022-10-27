package slash.code.strategy;

public class CreditCard {

    String cardNumber;
    String expirationDate;
    String cvv;
    int amount=0;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
