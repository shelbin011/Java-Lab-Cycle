class Persion{
    String name;
    int age;
    Persion(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Persion{
    int rollNo;
    double marks;
    Student(String name, int age , int rollNo,double marks){
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }


    public void Display(){
        System.out.println("Student name is : "+super.name);
        System.out.println("Student age is : "+super.age);
        System.out.println("Student rollno is : "+rollNo);
        System.out.println("Student makrks is : "+marks);
    }

}

public class ca2_lab_2 {
    public static void main(String[] args){
        Student s = new Student("sasi",10,153,15);
        s.Display();
    }
}
