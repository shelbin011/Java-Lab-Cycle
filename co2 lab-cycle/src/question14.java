// Question no 14
// Write a recursive Java program to calculate the factorial of a given number.

class question14 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial = " + factorial(n));
    }
}