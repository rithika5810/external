public class Factorial {
    public static long compute(int n) {
        if (n < 0)
             throw new IllegalArgumentException("Negative number not allowed");
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * compute(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + compute(number));
    }
}