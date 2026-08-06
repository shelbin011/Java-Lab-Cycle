import java.util.Scanner;

public class groceryShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double DISCOUNT = 0.10;

        System.out.print("Enter price of item 1: ");
        double item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = input.nextDouble();

        double total = item1 + item2 + item3;

        double discountAmount = total * DISCOUNT;

        double finalAmount = total - discountAmount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}