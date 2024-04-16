package lesson12.homework;

import java.util.Scanner;

public class Task01 {

    /*
     Сделать симуляцию кассы. Где пользователь вводит название продукта и получает его цену.
     Если продукта нет в списке, то вывести - "данного продукта нет в магазине".
     Если продукт есть - вывести его цену.
     Запросить кол-во продукта и посчитать цену.
     Сравнить кол-во с остатками и если нет - вывести
     */

    public static void main(String[] args) {

        String[] productsList = {"Молоко", "Яйца", "Хлеб", "Вода", "Мясо"};
        // заполняем массив ценами в Евро сответсвующими позиции
        double[] priceList = {1.05, 1.99, 1, 0.5, 4.40};
        int[] quantity = {100, 50, 50, 100, 20};

        System.out.println("Введите название продукта, чтобы узнать его цену: ");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();

        for (int i = 0; i < productsList.length; i++) {
            if (userChoice.equalsIgnoreCase(productsList[i])) {
                System.out.println("Введите кол-во товара: ");
                int amount = scan.nextInt();
                if (amount <= quantity[i]) {
                    System.out.println(productsList[i] + " " + amount + "ед." + " по цене - " + priceList[i] * amount + "€");
                    return;
                }
                System.out.println("К сожалению столько нет на складе! У нас всего " + quantity[i] + "ед.");
                return;
            }
        }
        System.out.println("К сожалению, данного продукта нет в магазине!");
    }
}
