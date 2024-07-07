package NGlesson34.classwork.FourthExample;

import NGlesson34.classwork.StreamMapExample.Book;
import NGlesson34.classwork.StreamMapExample.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task {

    // Из списка книг создать Мапу. Где ключ - название книги - значение человек кто ее читает

    public static void main(String[] args) {

        Person daniil = new Person("Даниил");
        Person artur = new Person("Артур");
        Person vladimir = new Person("Владимир");
        Person alexander = new Person("Александр");
        Person anton = new Person("Антон");

        Book book1 = new Book("Преступление и наказание", daniil);
        Book book2 = new Book("Дубровский", artur);
        Book book3 = new Book("Отцы и дети", vladimir);
        Book book4 = new Book("Евгений Онегин", alexander);
        Book book5 = new Book("Война и мир", anton);
        Book book6 = new Book("Пиковая Дама", anton);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        // собрали все в мапу

       Map<String, String> map =  books.stream()
                .collect(Collectors.toMap(b-> b.getName(), b -> b.getBorrowedBy().getName()));

        System.out.println(map);

    }
}
