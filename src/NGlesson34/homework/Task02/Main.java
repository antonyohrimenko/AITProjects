package NGlesson34.homework.Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1. Создайте класс Person
1.2 Добавьте в этот класс 3 поля: имя, папа и мама. Папа и мама - тоже поля класса Person
2.1. У вас есть список из людей, найдите среди них всех их мам и пап, у которых имя длиннее 6 букв
 */

public class Main {
    public static void main(String[] args) {

        //создадим людей, особо не вдаваясь в традиционные семьи =)

        Person p1 = new Person("Александра", null, null);
        Person p2 = new Person("Александр", null, null);
        Person p3 = new Person("Елизавета", p2, p1);
        Person p4 = new Person("Кристина", p2, null);
        Person p5 = new Person("София", null, p3);
        Person p6 = new Person("Ибрагим", p2, p4);

        // Список людей
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        // Поиск всех мам и пап с именем длиннее 6 букв
        List<Person> parentsWithLongNames = people.stream()
                .flatMap(person -> Stream.of(person.getFather(), person.getMother()))
                .filter(parent -> parent != null && parent.getName().length() > 6)
                .distinct()
                .collect(Collectors.toList());

        // Вывод результатов
        System.out.println("Родители с именами длинее 6 букв:");
        parentsWithLongNames.forEach(System.out::println);
    }
}
