package slash.code.strategy;

public class PaymentStrategyTest {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService(10,true);
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
        paymentService.setStrategy(new PaymentByPaypal());
        paymentService.processOrder();


    }
}
