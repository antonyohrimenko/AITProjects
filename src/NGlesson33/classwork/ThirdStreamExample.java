package NGlesson33.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ThirdStreamExample {
    public static void main(String[] args) {

        // есть список из чисел. Нужно отсортировать и вывести на экран
        // 5 самых маленьких из них
        // доп. добавить все кратрые 5

        // у стримов есть методы промежуточные и терминальные

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(0, 10_000));
        }

        List<Integer> newList = list.stream()
                .map(x -> x + 4) // добавили к каждому числу 4
                .sorted() // отсортировали наш лист
                .filter(x -> x % 5 == 0) // порядок важен, отфильтровали сначала кратные 5
                .limit(5) // оставляет первые 5 элементов
                .toList(); // вернул лист отсортированный. ТЕРМИНАЛЬНЫЙ МЕТОД

        long count = list.stream().count(); // позволяет получить кол-во элементов ТОЖЕ ТЕРМИНАЛЬНЫЕ МЕТОД
        System.out.println(count);

        boolean all = list.stream().allMatch(x -> x > 9_000); // ТЕРМИНАЛЬНЫЙ. Возвращает тру если ВСЕ соотносятся с условием
        boolean any = list.stream().anyMatch(x -> x > 9_000); // ТЕРМИНАЛЬНЫЙ. Возвращает тру если хотя бы ОДИН соотносится с уловием

        System.out.println(all); // сравнивает всех
        System.out.println(any); // сравнивает хотя бы одного


        Optional<Integer> anyOptional = list.stream().findAny(); // возвращает какой-то элемент, ( любой случайный )
        Optional<Integer> firstOptional = list.stream().findFirst(); // возвращает первый элемент из стрима
        // и дальше мы можем применить findAny.get(); и получить значение

        // list.stream().forEach(x -> System.out.println("Приветики")); // делает для каждого элемента стрима что-то напишем



        System.out.println(newList);

        // промежуточные методы
        System.out.println(" ============== ");

        long distinctCount = list.stream().distinct().count(); // оставляет только уникальные элементы в стриме
        System.out.println(distinctCount);


        // можно выделить лямбда выражение в метод, используется не часто
        List<Integer> moreThanZero =  list.stream().filter(x -> moreThanZero(x)).toList();

    }

    // метод для использования тестовый
    public  static boolean moreThanZero (int x) {
        return x > 0;
    }
}
