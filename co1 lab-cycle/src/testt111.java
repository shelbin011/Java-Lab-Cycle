public class testt111 {

    static int naturalsum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + naturalsum(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Sum = " + naturalsum(n));
    }
}