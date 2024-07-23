package NGlesson39.homework.task03;

import java.time.LocalDateTime;

/*
3. Создать класс Meeting (встреча),
3.1 В класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
3.2 Создайте несколько встреч
3.3 Найдите среднее время начала всех встреч
(Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
Тогда среднее время начала встречи - 15-00)
 */
public class Meeting {
    private String person1;
    private String person2;
    private LocalDateTime meetingDateTime;

    public Meeting(String person1, String person2, LocalDateTime meetingDateTime) {
        this.person1 = person1;
        this.person2 = person2;
        this.meetingDateTime = meetingDateTime;
    }

    public String getPerson1() {
        return person1;
    }

    public String getPerson2() {
        return person2;
    }

    public LocalDateTime getMeetingDateTime() {
        return meetingDateTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "person1='" + person1 + '\'' +
                ", person2='" + person2 + '\'' +
                ", meetingDateTime=" + meetingDateTime +
                '}';
    }
}
