package NGlesson39.classwork;


//работа с датой и временем

import java.util.Date;

public class DateTimeExample {

    public static void main(String[] args) {

        System.currentTimeMillis(); // кол-во милисекунд которые прошли с 1го января с 1970 года по гринвичу
        // никто так не пишет, чисто для дани уважения юникс.


        // класс из библиотеки java.util
        // никогда его не надо использовать
        Date date = new Date();
        Date date1 = new Date(0);
        Date date2 = new Date(2000, 4, 24);
        System.out.println(date);
        System.out.println(date1); // плохо и неудобно работать с часовыми поясами, у всех время будет разное
        System.out.println(date2);








    }
}
