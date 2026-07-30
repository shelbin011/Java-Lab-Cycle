class student{
    String name;
    float mark;
    public void display(){
        System.out.print(name);
        System.out.println(mark);
    }
}

public class StudentsMark {
    public static void main(String[] args){
        student s1 = new student();
        s1.name="shibu";
        s1.mark=10;
        s1.display();
    }
}
