package NGlesson32.classwork;

import java.util.function.*;

public class FunctionMain {
    public static void main(String[] args) {

        Button a = () -> System.out.println(1);

        // первый пример функционального интерфейса (предикат)
        Predicate <Integer> predicate = (x) -> (x > 10);
        System.out.println(predicate.test(9));


        // второй пример функционального интерфейса (функция)
        Function<String, Integer> function = (str) -> str.length() + 10;
        int result = function.apply("ПРИВЕТ");
        System.out.println(result);

        //пример функционального интерфейса третий (поглощает все и не выдает ничего)
        Consumer<String> consumer = System.out::println; // еще короче запись, метод внутри. Метод референс, ссылка на метод
        consumer.accept("232323");

        // унарный интерфейс
        UnaryOperator<Integer> unaryOperator = (y) -> y + 5;

        // бинарный оператор
        BinaryOperator<Integer> binaryOperator = Math::min;





    }
}
