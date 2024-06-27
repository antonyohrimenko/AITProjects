package NGlesson32.homework;

/*
Создать обобщенный класс с тремя параметрами (T, V, K).
Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
методы возвращающие значения трех переменных.
Создать метод, выводящий на консоль имена классов для трех переменных класса.
Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
 */

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры классов
        String tValue = "Hello";
        Dog vValue = new Dog("Buddy");
        Integer kValue = 42;

        // Создаем объект класса Triple
        Triple<String, Dog, Integer> triple = new Triple<>(tValue, vValue, kValue);

        // Создаем сервис для работы с Triple
        TripleService tripleService = new TripleService();

        // Выводим информацию о Triple
        tripleService.printTripleInfo(triple);
    }
}

