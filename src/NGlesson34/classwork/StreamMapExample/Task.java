package NGlesson34.classwork.StreamMapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task {

    // есть список книг, у каждой есть запись о том кто ее взял
    // нужно вывести списко людей, которые взяли книги, при этом их имена должны
    // начинаться на букву А

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
        Book book6 = new Book("Пиковая Дама", null);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        // нужно вывести списко людей, которые взяли книги, при этом их имена должны
        // начинаться на букву А

        // переходим от книг к людям
        List <String> people = books.stream()
                .map(Book::getBorrowedBy)
                .filter(Objects::nonNull) // метод референс, ссылка на метод
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("А"))
                .map(Person::getName)
                .toList();

        System.out.println(people);








    }
}
