package lesson19.homework;

public class Pen {

    // описываем простую ручку

    private int ink_value = 10; // для теста ставил. Так то значние 100 :)
    private String brand;

    // пишем конструктор (обьем чернил в ручках будет одинаковый у всех = 100
    public Pen(String brand) {
        this.brand = brand;
    }

    // пишем гетеры и сеттеры. Пишем их только для кол-ва чернил
    // по сути это уже метод checkInk() из задания

    public int getInk_value() {
        return this.ink_value;
    }

    // по сути сеттер это уже заправка чернилами
    public void setInk_value(int ink_value) {
        this.ink_value = ink_value;
    }

    /*
     методы делаю на уровне пакета
     Так как ручка у нас не затрачивает чернила на пробелы в строке
     то будем длину строки получать без учета пробела и сравнивать только кол-во букв!
     */

    void write(String str) {

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') { // Проверяем, не является ли текущий символ пробелом
                if (ink_value > 0) {
                    System.out.print(currentChar);
                    ink_value--;
                } else {
                    System.out.println("\nSorry, I can't write anymore. Ink is: " + ink_value + ". Refill me!");
                    break;
                }
            } else { // Если символ - пробел, просто печатаем его без изменения количества чернил
                System.out.print(currentChar);
            }
        }
        System.out.println(); // Печать перевода строки в конце
    }

    // делаем метод refill
    void refill() {
        System.out.println("Refilling...DONE!");
        ink_value = 10; // для теста ставил. Так то значние 100 :)
    }

    // делаем метод checkInk
    void checkInk() {
        System.out.println("Remain: " + ink_value + " ml.");
    }
}
