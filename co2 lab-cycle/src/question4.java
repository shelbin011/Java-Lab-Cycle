//10/07/2026
// Write a Java program using the this keyword to distinguish local variables from instance variables. Display the stored values.
import java.util.Scanner;
class keyword{
    String name;
    int age;

    keyword(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
public class question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        keyword k1 = new keyword(name, age);
        k1.display();


    }
}
