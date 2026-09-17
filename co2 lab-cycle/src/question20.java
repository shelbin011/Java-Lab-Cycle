// Question no 20
// Write a Java program to demonstrate the use of the final keyword by declaring a constant PI and calculating the area of a circle.

class question20 {

    public static void main(String[] args) {

        final double PI = 3.14159;
        double radius = 5;

        double area = PI * radius * radius;

        System.out.printf("Area = %.2f%n", area);
    }
}