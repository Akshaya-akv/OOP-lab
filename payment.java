class Payment {

    
    void pay(double amount) {
        System.out.println("Paid amount: " + amount);
    }

    
    void pay(double amount, String currency) {
        System.out.println("Paid " + amount + " in " + currency);
    }

    
    void pay(double amount, String currency, double discount) {
        double finalAmount = amount - discount;
        System.out.println("Paid " + finalAmount + " after discount in " + currency);
    }
}

public class payment {
    public static void main(String[] args) {
        Payment p = new Payment();

        p.pay(1000);
        p.pay(1000, "INR");
        p.pay(1000, "INR", 100);
    }
}