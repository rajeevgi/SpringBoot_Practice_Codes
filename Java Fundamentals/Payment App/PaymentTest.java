public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new CreditCardPayment("1234-5678-9876-5432");
        PaymentProcessor payment2 = new UPIPayment("raj@upi");

        payment1.processPayment(15000);
        payment2.processPayment(1450);
    }
}
