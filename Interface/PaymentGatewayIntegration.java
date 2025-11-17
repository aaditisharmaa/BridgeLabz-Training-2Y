interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund initiated: ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid via Paytm: ₹" + amount); }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor p = new Paytm();
        p.pay(800);
        p.refund(200);
    }
}
