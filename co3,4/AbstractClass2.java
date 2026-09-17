abstract class Employee {

	abstract void calculatePay();

}

class Manager extends Employee {

	@Override

	void calculatePay() {

	System.out.println("Manager pay calculated");

	}

}


class Developer extends Employee {

	@Override

	void calculatePay() {

	System.out.println("Developer pay calculated");

	}

}

class AbstractClass2 {

	public static void main(String[] args) {

	Employee[] employees = new Employee[2];

	employees[0] = new Manager();

	employees[1] = new Developer();

	for(int i = 0; i < employees.length; i ++) {

		employees[i].calculatePay();

		}

	}

}