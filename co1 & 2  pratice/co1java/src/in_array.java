import java.util.Scanner;

public class in_array {
    public static void main(String[] args) {
        int m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        int[] student = new int[5];
        for (int i = 0; i < student.length; i++) {
            student[i] = s.nextInt();
        }
        for(int j = student.length-1; j>= 0;j--){
            System.out.println(student[j]);
        }
    }
}
