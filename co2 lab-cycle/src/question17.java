// Question no 17
// Write a Java program demonstrating access control by creating
// private data members and accessing them using public getter and setter methods.

class question17 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        question17 student = new question17();

        student.setName("Maya");
        student.setAge(19);

        System.out.println("Student Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}