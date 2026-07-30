class Employee{
    int id;
    String name;
    float salary;
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.id = 1;
        e1.name = "shelbin";
        e1.salary = 1000;

        e2.id = 2;
        e2.name = "raju";
        e2.salary = 1090;

        e3.id = 3;
        e3.name = "siva";
        e3.salary = 3000;

        System.out.println("the detailes:" + e1.id);
        System.out.println("the detailes:" + e1.name);
        System.out.println("the detailes:" + e1.salary);

        System.out.println("the detailes:" + e2.id);
        System.out.println("the detailes:" + e2.name);
        System.out.println("the detailes:" + e2.salary);

        System.out.println("the detailes:" + e3.id);
        System.out.println("the detailes:" + e3.name);
        System.out.println("the detailes:" + e3.salary);
    }
}