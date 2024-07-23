package NGlesson39.homework.task01;

import java.time.LocalDate;

/*
1. Создайте класс "Язык программирования"
1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
1.2 Создайте несколько языков программирования
1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)

 */
public class ProgrammingLanguage {
    private String name;
    private String authorOrCompany;
    private LocalDate firstVersionDate;

    public ProgrammingLanguage(String name, String authorOrCompany, LocalDate firstVersionDate) {
        this.name = name;
        this.authorOrCompany = authorOrCompany;
        this.firstVersionDate = firstVersionDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthorOrCompany() {
        return authorOrCompany;
    }

    public LocalDate getFirstVersionDate() {
        return firstVersionDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", authorOrCompany='" + authorOrCompany + '\'' +
                ", firstVersionDate=" + firstVersionDate +
                '}';
    }
}
