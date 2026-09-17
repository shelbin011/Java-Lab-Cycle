import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] stock = new int[8];

        // Read stock quantities
        System.out.println("Enter stock quantities:");

        for (int i = 0; i < stock.length; i++) {
            stock[i] = sc.nextInt();
        }

        // Check stock status
        System.out.println("\nStock Status:");

        for (int i = 0; i < stock.length; i++) {

            if (stock[i] < 10) {
                System.out.println("Product " + i + ": REORDER");
            } else {
                System.out.println("Product " + i + ": OK");
            }
        }

        // Search product
        System.out.print("\nEnter product index: ");
        int index = sc.nextInt();

        if (index < 0 || index >= stock.length) {
            System.out.println("Invalid product index! Please enter 0 to 7.");
        } else {
            System.out.println("Stock of product " + index + " = " + stock[index]);
        }

        // Calculate total stock
        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            total += stock[i];
        }

        System.out.println("Total stock = " + total);
    }
}