package NGlesson39.classwork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {


        // форматируем нормально дату

        LocalDate localDate = LocalDate.now();
        // форматтер
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String string =  localDate.format(dateTimeFormatter);



        System.out.println(string);



    }
}
