package lesson31.classwork.example03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                // key-value pair
                Map<String, String> dictionary = new HashMap<>();

                dictionary.put("hello", "привет");
                dictionary.put("integer", "целый");
                dictionary.put("programming", "программирование");
                dictionary.put("map", "карта");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите слово на английском");
                String word = scanner.next();
                if (dictionary.containsKey(word)) {
                    System.out.println("Перевод: " + dictionary.get(word));
                } else {
                    System.out.println("Такого слова нет в словаре!");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + ": " + dictionary.get(key));
                    }
                }
            }
        }

