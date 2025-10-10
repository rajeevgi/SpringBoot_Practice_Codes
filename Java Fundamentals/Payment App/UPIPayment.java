public class UPIPayment implements PaymentProcessor {
    private String upiId;

    public UPIPayment(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs." + amount + " using UPI ID: " + upiId);   
    }
    
}
