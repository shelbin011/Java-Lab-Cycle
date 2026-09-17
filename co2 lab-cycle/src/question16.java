// Question no 16
// Write a recursive Java program to find the nth Fibonacci number.

class question16 {

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Fibonacci Number = " + fibonacci(n));
    }
}