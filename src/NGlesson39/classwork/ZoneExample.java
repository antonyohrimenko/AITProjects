package NGlesson39.classwork;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);


        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
