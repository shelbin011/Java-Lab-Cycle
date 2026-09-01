import payment.*;
import payment.package_Upi;

public class main1 {
    public static void main(String[] args){
        PaymentMethod p1 = new packages_Credit();
        p1.pay(1000);
        PaymentMethod p2 = new package_Upi();
        p2.pay(2000);
    }
}
