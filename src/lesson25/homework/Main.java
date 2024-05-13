package lesson25.homework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите форму участка:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Круг");
        System.out.println("3. Правильный многоугольник");
        int choice = scan.nextInt();

        Shape shape = null;
        double perimeter = 0;

        switch (choice) {
            case 1:
                System.out.println("Введите ширину и высоту прямоугольника:");
                double width = scan.nextDouble();
                double height = scan.nextDouble();
                shape = new Rectangle(width, height);
                perimeter = shape.getPerimeter();
                break;
            case 2:
                System.out.println("Введите радиус круга:");
                double radius = scan.nextDouble();
                shape = new Circle(radius);
                perimeter = shape.getPerimeter();
                break;
            case 3:
                System.out.println("Введите количество сторон и длину стороны многоугольника:");
                int sides = scan.nextInt();
                double sideLength = scan.nextDouble();
                shape = new RegularPolygon(sides, sideLength);
                perimeter = shape.getPerimeter();
                break;
            default:
                System.out.println("Некорректный выбор.");
                break;
        }

        if (shape != null) {
            System.out.println("Введите цену за метр забора:");
            double pricePerMeter = scan.nextDouble();
            double totalPrice = perimeter * pricePerMeter;
            System.out.println("Общая цена забора: " + totalPrice);
        }

        scan.close();
    }
}
