// Question no 9
// Write a Java program to overload a method area() for calculating the area of a square and a rectangle.

class question9 {

    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public static void main(String[] args) {
        question9 obj = new question9();

        obj.area(5);
        obj.area(10, 5);
    }
}