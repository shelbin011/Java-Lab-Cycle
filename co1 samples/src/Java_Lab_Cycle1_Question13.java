import java.util.Scanner;

public class Java_Lab_Cycle1_Question13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int B = sc.nextInt();

        System.out.print("Enter the value of C: ");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("Largest = " + A);
        } else if (B >= A && B >= C) {
            System.out.println("Largest = " + B);
        } else {
            System.out.println("Largest = " + C);
        }

        sc.close();
    }
}