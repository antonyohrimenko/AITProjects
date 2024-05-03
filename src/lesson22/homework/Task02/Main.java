package lesson22.homework.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Выводим список доступных планет
        System.out.println("Доступные планеты:");
        SolarSystemPlanet[] planets = SolarSystemPlanet.values();
        for (int i = 0; i < planets.length; i++) {
            System.out.println((i + 1) + ". " + planets[i].getName());
        }

        System.out.println("Выберите номер планеты (от 1 до " + SolarSystemPlanet.values().length + "):");
        int planetNumber = scan.nextInt();

        if (planetNumber >= 1 && planetNumber <= SolarSystemPlanet.values().length) {

            // можно создать отдельный метод в enum типа (planetInfo) и вызывать его вместо sout
            SolarSystemPlanet planet = SolarSystemPlanet.values()[planetNumber - 1];
            System.out.println("Вы выбрали планету " + planet.getName());
            System.out.println("Класс: " + classifyPlanet(planet));
            System.out.println("Радиус: " + planet.getRadius() + " км");
            System.out.println("Масса: " + planet.getMass() + " кг");
            System.out.println("Ускорение свободного падения на поверхности планеты: " +
                    String.format("%.2f", planet.calculateGravity()) + " м/с²"); // Alt+0178 спецсимвол
        } else {
            System.out.println("Некорректный номер планеты!");
        }
    }

    public static String classifyPlanet(SolarSystemPlanet planet) {

        switch (planet) {
            case MERCURY:
            case VENUS:
            case EARTH:
            case MARS:
                return "Безжизненный камень";
            case JUPITER:
            case SATURN:
            case URANUS:
            case NEPTUNE:
                return "Газовый гигант";
            default:
                return "Обитаемая планета"; // Здесь можно добавить ледяная планета или что-то подобное
        }
    }
}