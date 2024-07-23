package NGlesson39.homework.task03;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting("Вася", "Петя", LocalDateTime.of(2023, 6, 1, 14, 0)));
        meetings.add(new Meeting("Саша", "Маша", LocalDateTime.of(2023, 6, 2, 16, 0)));
        meetings.add(new Meeting("Григорий Андреевич", "Валентин Степанович", LocalDateTime.of(2023, 6, 3, 15, 0)));

        OptionalDouble averageMeetingTimeInMinutes = meetings.stream()
                .mapToInt(meeting -> meeting.getMeetingDateTime().toLocalTime().toSecondOfDay())
                .average();

        if (averageMeetingTimeInMinutes.isPresent()) {
            LocalTime averageMeetingTime = LocalTime.ofSecondOfDay((long) averageMeetingTimeInMinutes.getAsDouble());
            System.out.println("The average meeting time is: " + averageMeetingTime);
        } else {
            System.out.println("No meetings found");
        }
    }
}
