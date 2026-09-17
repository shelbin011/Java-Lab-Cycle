// Question no 10
// Write a Java program to pass an object to a method that displays student details.

class question10 {

    String name;
    int rollNo;
    double marks;

    question10(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent(question10 student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNo);
        System.out.println("Marks: " + student.marks);
    }

    public static void main(String[] args) {
        question10 student = new question10("Binitta", 10, 95.5);

        student.displayStudent(student);
    }
}