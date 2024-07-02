package NGlesson33.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1200);
        list.add(2300);
        list.add(4300);
        list.add(4500);
        list.add(12000);
        list.add(16000);
        list.add(500);

        // всем подняли зп на 10%
        // вычесть налог 40%
        // найдите новый общий зарплатный фонд



        Optional<Double> result =  list.stream()
                .map(x -> x * 1.1) // обычное промежуточное действие
                .map (x -> x - 0.4 * x)
                .reduce((x, y) -> x + y);  // позволяет редуцировать до одного значения
        // терминальный метод/действие, складывает все значения в листе и в результате получается одно число

        System.out.println(result.get());

        // Optional это коробочка. Из нее мы получаем значение через гет





    }
}
