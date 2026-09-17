import java.util.Scanner;

public class Java_Lab_Cycle1_Question3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        int count = 3;

        if (count != 0) {
            double average = (num1 + num2 + num3) / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}