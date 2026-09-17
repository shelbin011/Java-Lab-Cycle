// 10/07/2026
//Write a Java program to demonstrate constructor overloading using a Rectangle class (default and parameterized constructors). Display the area in both cases.
import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length = 1;
        breadth = 1;

    }

    Rectangle(int l, int b){
        length = l;
        breadth = b;

    }

    int area(){
        return length * breadth;
    }
}
public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth ");
        int b = sc.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Rectangl 1 Area: " + r1.area());
        System.out.println("Rectangl 2 Area: " + r2.area());
    }
}
