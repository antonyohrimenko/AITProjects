package lesson02.classwork;

public class Main01 {
    public static void main(String[] args) {

        // тип переменных a и b объявлен явно. То есть мы знаем, что они НЕ целые
        // хотя и выглядят похоже =)

        double a = 1, b = 2;
        System.out.println(a/b);

        /*
        переменная объявлена не явно, результат от деления округляется в меньшую сторону (вниз)
        тк числа учитываются как целые (int). То есть происходит деление двух целых чисел.
        А результат (0) мы записываем как число с плавающей точкой (0.0). Можно один из аргументов
        привести к double путем либо добавив ноль после запятой, либо добавив 2d/3 или 2/3d
        */

        // double number = 2d/3;
        double number = 2/3;
        System.out.println(number);
    }

}