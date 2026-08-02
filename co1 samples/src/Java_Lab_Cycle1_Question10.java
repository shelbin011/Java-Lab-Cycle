import java.util.Scanner;

public class Java_Lab_Cycle1_Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();

        System.out.print("Enter the value of e: ");
        int e = sc.nextInt();

        int result = a + b * c - d / e;

        System.out.println("Result = " + result);

        sc.close();
    }
}