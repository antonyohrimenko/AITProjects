package lesson31.homework.Task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> productList = new HashMap<>();

        productList.put("Молоко", 1.05);
        productList.put("Яйца", 1.05);
        productList.put("Хлеб", 1.05);
        productList.put("Вода", 1.05);
        productList.put("Мясо", 1.05);

        System.out.println("Напишите название товара, чтобы узнать цену: ");

        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();

        if (productList.containsKey(userChoice)) {
            System.out.println("Продукт: " + userChoice + " стоит " + productList.get(userChoice));
        } else {
            System.out.println("Такого продукта нет в списке!");
        }
    }
}
