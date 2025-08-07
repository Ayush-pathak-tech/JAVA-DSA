public class fabonacci {
// find nth faboancci number
//     Fib(0) = 0, Fib(1) = 1
// 📌 Fib(n) = Fib(n-1) + Fib(n-2)
// 📌 Recursive = Simple but slow
// 📌 Iterative = Fast and memory efficient
// 📌 Memoization = Best when many queries on Fibonacci
    public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}

}
