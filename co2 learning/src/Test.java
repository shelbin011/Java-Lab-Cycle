class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name : " + name);
    }
}

class Student extends Person {
    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }

    void display() {
        super.displayName();
        System.out.println("Course : " + course);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Shelbin", "MCA");
        s.display();
    }
}