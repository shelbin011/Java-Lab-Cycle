// Question no 8
// Write a Java program to overload a method display() for printing an integer, a double, and a string.

class question8 {

    void display(int n) {
        System.out.println("Integer: " + n);
    }

    void display(double n) {
        System.out.println("Double: " + n);
    }

    void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        question8 obj = new question8();

        obj.display(10);
        obj.display(10.5);
        obj.display("Hello Java");
    }
}