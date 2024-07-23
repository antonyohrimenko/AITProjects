package NGlesson39.classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {
    public static void main(String[] args) {

        // более новый класс, можно использовать

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate newDate = localDate.plusWeeks(1); // добавляем 1 неделю к той дате
        System.out.println(newDate);
        newDate = newDate.withYear(1960); // земеняет на любую произвольную дату
        System.out.println(newDate);





    }
}
