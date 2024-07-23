package NGlesson38.homework;

import NGlesson38.homework.Exceptions.CheckedCustomException;
import NGlesson38.homework.Exceptions.UncheckedCustomException;
import NGlesson38.homework.task01.SumCalculator;
import NGlesson38.homework.task02.NumberComparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainFromFile {
    public static void main(String[] args) {

        File file = new File("resources/numbersHW38.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);

                // Задача 2.1
                try {
                    SumCalculator.calculateSum(number);
                } catch (UncheckedCustomException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // Задача 2.2
                if ((line = bufferedReader.readLine()) != null) {
                    int secondNumber = Integer.parseInt(line);
                    try {
                        NumberComparator.compareNumbers(number, secondNumber);
                    } catch (CheckedCustomException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}