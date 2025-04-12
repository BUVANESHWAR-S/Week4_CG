package Day6;

public class pb5 {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 30;
        int N3 = 50;

        long startTime = System.nanoTime();
        fibonacciRecursive(N1);
        long endTime = System.nanoTime();
        System.out.println("Recursive Fibonacci (10): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        fibonacciIterative(N1);
        endTime = System.nanoTime();
        System.out.println("Iterative Fibonacci (10): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        fibonacciRecursive(N2);
        endTime = System.nanoTime();
        System.out.println("Recursive Fibonacci (30): " + (endTime - startTime) / 1000000000.0 + " s");

        startTime = System.nanoTime();
        fibonacciIterative(N2);
        endTime = System.nanoTime();
        System.out.println("Iterative Fibonacci (30): " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        fibonacciRecursive(N3);
        endTime = System.nanoTime();
        System.out.println("Recursive Fibonacci (50): " + (endTime - startTime) / 1000000000.0 + " s");

        startTime = System.nanoTime();
        fibonacciIterative(N3);
        endTime = System.nanoTime();
        System.out.println("Iterative Fibonacci (50): " + (endTime - startTime) / 1000000.0 + " ms");
    }
}

