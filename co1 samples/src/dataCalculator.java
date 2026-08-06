import java.util.Scanner;

public class dataCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double DATA_LIMIT = 30.0;

        System.out.print("Enter data used (GB): ");
        double usedData = input.nextDouble();

        double remainingData = DATA_LIMIT - usedData;

        System.out.println("Used: " + usedData + " GB");
        System.out.println("Remaining: " + remainingData + " GB");
    }
}