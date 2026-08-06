import java.util.Scanner;

public class travel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();

        System.out.print("Enter mileage (km/litre): ");
        double mileage = input.nextDouble();

        System.out.print("Enter petrol price per litre: ");
        double petrolPrice = input.nextDouble();

        double fuelNeeded = distance / mileage;
        double cost = fuelNeeded * petrolPrice;

        System.out.println("Fuel Needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);
    }
}