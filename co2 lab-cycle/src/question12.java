// Question no 12
// Write a Java program in which a method returns a Student object containing name and mark. Display the returned object's details.

class question12 {

    String name;
    int mark;

    question12(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    static question12 getStudent() {
        return new question12("Arun", 87);
    }

    public static void main(String[] args) {
        question12 student = getStudent();

        System.out.println("Student Name : " + student.name);
        System.out.println("Mark : " + student.mark);
    }
}