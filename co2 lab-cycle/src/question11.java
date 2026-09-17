// Question no 11
// Write a Java program to pass two Box objects to a method and display the larger box based on volume.

class question11 {

    double length;
    double width;
    double height;

    question11(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    static void compareBox(question11 box1, question11 box2) {
        if (box1.volume() > box2.volume()) {
            System.out.println("Larger Box Volume = " + box1.volume());
        } else {
            System.out.println("Larger Box Volume = " + box2.volume());
        }
    }

    public static void main(String[] args) {
        question11 box1 = new question11(3, 4, 5);
        question11 box2 = new question11(5, 4, 6);

        compareBox(box1, box2);
    }
}