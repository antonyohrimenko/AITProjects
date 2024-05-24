package lesson30.classwork.example01;

public class Main {
    public static void main(String[] args) {

        // анонимные классы тестируем

        HelloPrinter eng = new HelloPrinter() {
            @Override
            public void PrintHello() {
                System.out.println("Hello!");
            }
        };

        HelloPrinter rus = new HelloPrinter() {
            @Override
            public void PrintHello() {
                System.out.println("Приветики!");
            }
        };

        HelloPrinter de = new HelloPrinter() {
            @Override
            public void PrintHello() {
                System.out.println("Moin Moin");
            }
        };

        eng.PrintHello();
        rus.PrintHello();
        de.PrintHello();
    }
}
