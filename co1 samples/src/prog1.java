import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = s.nextInt();
        if (age >= 18){
            System.out.print("You are eligible for voteing");

        } else{
            System.out.print("You are not eligible");
        }
    }
}