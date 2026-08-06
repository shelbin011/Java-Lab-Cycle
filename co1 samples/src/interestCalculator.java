import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double DEFAULT_RATE = 5.0;

        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter Rate of Interest : ");
        double rate = input.nextDouble();

        if (rate == 0) {
            rate = DEFAULT_RATE;
        }

        double interest = (principal * rate * time) / 100;

        System.out.println("Interest = " + interest);
    }
}