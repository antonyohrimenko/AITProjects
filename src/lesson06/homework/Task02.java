package lesson06.homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
         Пользователь вводит сумму своих заказов, чтобы понять, в какую стоимость
         ему выйдет доставка. Также пользователь вводит расстояние в (км) до склада.
         Тарифная сетка определена ниже:

         // расстояние "на глаз" =)
         // суммы в $

         1) Если расстояние до 100км
         - сумма покупок до 10 000$ - доставка 500$
         - сумма покупок от 10 000$ до 20 000$ - доставка 300$
         - сумма от 20 000$ - бесплатная

         2) Если расстояние больше 100км

         - сумма покупок до 10 000$ - доставка 500$ + 4$ за каждый километр выше 100км
         - сумма покупок от 10 000$ до 20 000$ - доставка 300$ + 2$ за каждый киломентр выше 100км
         - сумма от 20 000$ - бесплатная, если расстояние выше 300км - доставка не возможна.
         */

        System.out.println("Enter the cost of your Orders in $: ");
        double cost = new Scanner(System.in).nextDouble();
        System.out.println("Enter your distance in (km): ");
        double distance = new Scanner(System.in).nextDouble();

        double delivery_cost = 0;
        // в целом данная переменная нам и не нужна
        // оставил ее просто для того, чтобы код визуально читался лучше
        // и было наглядно понятно что происходит внутри условий

        String message = "The amount of your orders: " + cost + "\nYour delivery cost: ";


        if (cost <= 10000 && distance <=100) {
            message+= delivery_cost = 500;
        } else if (cost <=20000 && distance <=100) {
            message+= delivery_cost = 300;
        } else if (cost > 20000 && distance <=100) {
            message+= delivery_cost = 0;
        } else if (cost <= 10000 && distance <= 300) {
            message += delivery_cost = 500 + (distance - 100) * 4;
        } else if (cost < 20000 && distance <= 300) {
            message += delivery_cost = 300 + (distance - 100) * 2;
        } else if (cost > 20000 && distance <= 300) {
            message+= delivery_cost = 0;
        }
        else {
            message = "Your distance of " + distance + "km" + " is too far, we only process orders within 300km!";
        }
        System.out.println(message);
    }
    }