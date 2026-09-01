class Employee{
    final String companyName;
    double salary;

    Employee(String companyName ,double salary){
        this.companyName = companyName;
         this.salary = salary;
    }

    public double calculateBonus(){
        double bonus;
        bonus = 5.0/100 * salary;
        return bonus;
    }

}
class Manager extends Employee{

    Manager(String companyName, double salary){
        super(companyName, salary);
    }

    @Override
    public double calculateBonus() {
        double bonus = 10.0/100 * salary;
        return bonus;
    }
}
class SeniorManager extends Employee{
    double rebonus;
    SeniorManager(String companyName ,double salary, double rebonus){
        super(companyName, salary);
        this.rebonus = rebonus;
    }
    @Override
    public double calculateBonus(){
        double bonus = (15.0/100) * salary;
        return bonus + rebonus;
    }
}

public class MultiLevelHierarchy_1 {
    public static void main(String[] args) {
        Employee e = new Employee("Infosis",1000);
        Manager m = new Manager("info",2000);
        SeniorManager sm = new SeniorManager("in",3000,300);

        System.out.println(e.calculateBonus());
        System.out.println(m.calculateBonus());
        System.out.println(sm.calculateBonus());
    }
}
