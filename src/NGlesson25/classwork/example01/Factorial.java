package NGlesson25.classwork.example01;

public class Factorial {

    public static void main(String[] args) {

        long start = System.nanoTime();
        System.out.println(factorialCommon(15));
        long finish = System.nanoTime();
        long result = finish - start;
        System.out.println(result);

        System.out.println("=======");

        start = System.nanoTime();
        System.out.println(factorialRecursion(15));
        finish = System.nanoTime();
        result = finish - start;
        System.out.println(result);

    }

    // напишем 2 метода, один обычный, второй рекурсию

    public static int factorialCommon(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // напишем рекурсией
    public static int factorialRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }


}
