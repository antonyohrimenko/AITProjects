package NGlesson25.classwork.example01;

public class Fibonachi {

    public static void main(String[] args) {

        System.out.println(fibonacciCommon(10));
        System.out.println(fibonacciRecursion(10));

    }

    public static int fibonacciCommon(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i -2];
        }

        return fib[fib.length - 1];
    }

    // делаем рекурсивный фибоначи

    public static int fibonacciRecursion(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

}
