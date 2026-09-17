// Question no 13
// Write a Java program where a method returns a Circle object after computing its area. Display the radius and area.

class question13 {

    double radius;
    double area;

    question13(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    static question13 calculateArea(double radius) {
        return new question13(radius);
    }

    public static void main(String[] args) {
        question13 circle = calculateArea(7);

        System.out.println("Radius = " + circle.radius);
        System.out.printf("Area = %.2f%n", circle.area);
    }
}