import java.util.Scanner;

class Rectangle{
    private double length;
    private double width;

    Scanner s = new Scanner(System.in);

    public void setDimensions(){
        System.out.print("Enter the length :");
        length = s.nextDouble();
        System.out.print("Enter the width :");
        width = s.nextDouble();
    }
    public double calculateArea(){
        double area = length * width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = length * width * 2;
        return perimeter;
    }
}

public class Question2 {
    public static void main(String[] args){

            Rectangle  r = new Rectangle();
            r.setDimensions();
            System.out.println("Area = "+r.calculateArea());
            System.out.println("Perimeter = "+r.calculatePerimeter());
    }
}
