import java.util.Scanner;

public class agecalculator {

    public static void main(String[] args) {

        int age;
        int current_age;
        int after_calc;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        age = input.nextInt();

        System.out.print("Enter the current year: ");
        current_age = input.nextInt();

        after_calc = current_age - age;

        System.out.println("Your age is: " + after_calc);

        input.close();
    }
}
