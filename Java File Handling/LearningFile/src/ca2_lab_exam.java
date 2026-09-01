class Shape {
    protected String name;
    Shape(String name){
        this.name= name;
    }

    protected void describe(){
        System.out.println("Shape name: " + name);
    }
}
class Circle extends Shape{
    double radius;
    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void describe(){
        super.describe();
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }


}

public class ca2_lab_exam {
    public static void main(String[] args){
        Circle c = new Circle("raju",10);
        c.describe();
    }
}
