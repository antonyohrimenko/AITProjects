package NGlesson39.homework.task01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ProgrammingLanguage> languages = new ArrayList<>();

        languages.add(new ProgrammingLanguage("Java", "Sun Microsystems", LocalDate.of(1995, 5, 23)));
        languages.add(new ProgrammingLanguage("C", "Dennis Richie", LocalDate.of(1972, 1, 1)));
        languages.add(new ProgrammingLanguage("Python", "Guido van Rossum", LocalDate.of(1991, 2, 20)));
        languages.add(new ProgrammingLanguage("JavaScript", "Brendan Eich", LocalDate.of(1995, 12, 4)));

        ProgrammingLanguage oldestLanguage = languages.stream()
                .min(Comparator.comparing(ProgrammingLanguage::getFirstVersionDate))
                .orElseThrow(() -> new RuntimeException("No languages found"));

        System.out.println("The oldest programming language is: " + oldestLanguage);
    }
}

