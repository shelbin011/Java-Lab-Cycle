import java.util.Scanner;

public class Java_Lab_Cycle1_Question12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade = B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = D");
        }

        sc.close();
    }
}