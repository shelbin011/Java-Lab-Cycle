abstract class Employee {

	abstract void work();

}

class Manager extends Employee {

	@Override

	void work() {

	System.out.println("Manager manages team");

	}

}

class Developer extends Employee {
	
	@Override

	void work() {

	System.out.println("Developer writes code");

	}

}

class AbstractClass1 {

	public static void main(String[] args) {

	Employee e1 = new Manager();

	Employee e2 = new Developer();

	e1.work();

	e2.work();

	}

}