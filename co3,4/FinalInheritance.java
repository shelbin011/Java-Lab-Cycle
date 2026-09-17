class Account {

	final double MIN_BALANCE = 1000;

	void displayMinimumBalance() {

	System.out.println("Minimum Balance : " + MIN_BALANCE);

	}

}

class SavingsAccount extends Account {

	void displayAccountType() {

	System.out.println("Account Type: Savings Account");

	}

}

class FinalInheritance {

	public static void main(String[] args) {

	SavingsAccount a = new SavingsAccount();

	a.displayAccountType();

	a.displayMinimumBalance();

	}

}