import java.util.Scanner;

public class studentclass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double avg;
        int mark1, mark2, mark3;
        int total;

        System.out.print("Enter the mark of 1st student: ");
        mark1 = s.nextInt();

        System.out.print("Enter the mark of 2nd student: ");
        mark2 = s.nextInt();

        System.out.print("Enter the mark of 3rd student: ");
        mark3 = s.nextInt();

        total = mark1 + mark2 + mark3;

        System.out.println("Total = " + total);

        avg = total / 3.0;

        System.out.println("Average = " + avg);

        if (avg >= 50) {
            System.out.println("Above 50 average");
        } else {
            System.out.println("Below 50 average");
        }
    }
}