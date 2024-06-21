package NGlesson31.classwork.CalculatorExample;

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator<Integer> calculator = new Calculator<>();
        Integer result = calculator.sum(10,15);
        System.out.println(result);

        Printer<Integer> printer = new Printer<>();
        printer.print(5);

        Printer<Double> printer1 = new Printer<>();
        printer1.print(12.3);

        Printer<Long> printer2 = new Printer<>();
        printer2.print(234567890123L);
    }
}
