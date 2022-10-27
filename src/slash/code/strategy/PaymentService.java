package slash.code.strategy;

public class PaymentService {
    private final int cost;
    private final boolean includeDelivery;
    private PaymentStrategy strategy;

    public PaymentService(int cost, boolean includeDelivery) {
        this.cost = cost;
        this.includeDelivery = includeDelivery;
    }

    public void processOrder(){

        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails()){
            strategy.pay(getTotal());
        }

    }

    public int getTotal(){
        return includeDelivery ? cost+10 : cost;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
