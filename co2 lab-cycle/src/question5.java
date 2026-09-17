//10/07/2026
// Write a Java program using this(). The program should  invoke MULTIPLE Constructors

import java.util.Scanner;
class MultipleConstructors{
    String name;
    int age;

    MultipleConstructors(){
        this("Jaimon", 24);
    }

    MultipleConstructors(String name, int age){
        this.name = name;
        this.age = age;

    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}

public class question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = sc.next();

        System.out.print("enter age: ");
        int age = sc.nextInt();


        MultipleConstructors mc = new MultipleConstructors();
        MultipleConstructors mc1 = new MultipleConstructors(name, age);

        System.out.println("\nDefault Constructor:");
        mc.display();

        System.out.println("\nParameterized Constructor:");
        mc1.display();
    }
}
