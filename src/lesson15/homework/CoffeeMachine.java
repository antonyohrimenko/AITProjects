package lesson15.homework;

import java.util.Scanner;

public class CoffeeMachine {

    // обьявляем глобальные переменные (делаем их privat и final)
    private static final int PIN_CODE = 8956;
    private static final int INITIAL_CUPS = 50;
    private static final int INITIAL_COFFEE_POWDER = 500;
    private static final int INITIAL_WATER = 7000; // 7000
    private static final int INITIAL_MILK = 3000; // 3000

    // "загружаем" машину под завязку
    private static int cups = INITIAL_CUPS;
    private static int coffeePowder = INITIAL_COFFEE_POWDER;
    private static int water = INITIAL_WATER;
    private static int milk = INITIAL_MILK;
    private static int money = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Machine!");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Buy Coffee");
            System.out.println("2. Open Machine");
            System.out.println("0. Shut Down");

            int choice = scanner.nextInt();
            if (choice == 0) {
                shutDown(scanner);
            } else if (choice == 1) {
                buyCoffee(scanner);
            } else if (choice == 2) {
                openMachine(scanner);
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // метод для выбора и покупки кофе, а проверки доступности ингридиентов
    private static void buyCoffee(Scanner scanner) {
        System.out.println("\nAvailable Coffees:");
        System.out.println("1. Espresso - $3");
        System.out.println("2. Latte - $7");
        System.out.println("3. Americano - $5");
        System.out.println("0. Back to Main Menu");

        int choice = scanner.nextInt();
        if (choice == 0) {
            return;
        }

        int price = 0;
        int coffeePowderNeeded = 0;
        int waterNeeded = 0;
        int milkNeeded = 0;
        String coffeeType = "";
        switch (choice) {
            case 1:
                price = 3;
                coffeePowderNeeded = 15;
                waterNeeded = 150;
                coffeeType = "Espresso";
                break;
            case 2:
                price = 7;
                coffeePowderNeeded = 20;
                waterNeeded = 170;
                milkNeeded = 170;
                coffeeType = "Latte";
                break;
            case 3:
                price = 5;
                coffeePowderNeeded = 25;
                waterNeeded = 350;
                coffeeType = "Americano";
                break;
            default:
                System.out.println("Invalid choice! Try again.");
                return;
        }

        if (checkIngredients(coffeePowderNeeded, waterNeeded, milkNeeded)) {
            cups--;
            coffeePowder -= coffeePowderNeeded;
            water -= waterNeeded;
            milk -= milkNeeded;
            money += price;
            System.out.println("Take your " + coffeeType + "!");
        } else {
            System.out.println("Not enough ingredients to make a coffee!");
        }
    }

    // метод для проверки ингридиентов
    private static boolean checkIngredients(int coffeePowderNeeded, int waterNeeded, int milkNeeded) {
        return cups > 0 && coffeePowder >= coffeePowderNeeded && water >= waterNeeded && milk >= milkNeeded;
    }

    // метод для открытия машины
    private static void openMachine(Scanner scanner) {
        System.out.println("Enter PIN code to open machine:");
        int pin = scanner.nextInt();
        if (pin == PIN_CODE) {
            System.out.println("\nMachine Menu:");
            System.out.println("1. Take Money");
            System.out.println("2. Refill Ingredients");
            System.out.println("3. Shut Down");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Taking money: $" + money);
                    money = 0;
                    break;
                case 2:
                    refillIngredients();
                    break;
                case 3:
                    System.out.println("Shutting down...");
                    System.exit(0); // не уверен что так надо было, но работает
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } else {
            System.out.println("Incorrect PIN code! Access denied.");
        }
    }

    // наполняем по максимуму ингридиенты
    private static void refillIngredients() {
        cups = INITIAL_CUPS;
        coffeePowder = INITIAL_COFFEE_POWDER;
        water = INITIAL_WATER;
        milk = INITIAL_MILK;
        System.out.println("Ingredients refilled successfully.");
    }

    // метод для выключения по пин-коду
    private static void shutDown(Scanner scanner) {
        System.out.println("Enter PIN code to shut down the machine:");
        int pin = scanner.nextInt();
        if (pin == PIN_CODE) {
            System.out.println("Shutting down...");
            System.exit(0);
        } else {
            System.out.println("Incorrect PIN code! Access denied.");
        }
    }
}

