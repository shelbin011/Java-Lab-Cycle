import java.util.Scanner;

public class Java_Lab_Cycle1_Question9{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		int originalNum1 = num1;
		int originalNum2 = num2;

		System.out.println("The numbers before the swap");
		System.out.println("Value of first number: " + num1);
		System.out.println("Value of second number: " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The values after the swap using temporary variable");
		System.out.println("The value of first number: " + num1);
		System.out.println("The value of second number: " + num2);

		num1 = originalNum1;
		num2 = originalNum2;

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("The values after swapping with addition and substraction operators and not temporary variable");
		System.out.println("The value of first number: " + num1);
		System.out.println("The value of second number: " + num2);

		sc.close();
	}
}