package NGlesson31.homework;

//1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
//2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе,
// тип которого будет является дженериком
//3. Создайте приложение, которое спрашивает у пользователя, что положить в Message.
//3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
//3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип данных, который вы хотите положить в Message (string или integer):");
        String dataType = scanner.nextLine().toLowerCase();

        // напишем простенький свич. Не знаю хорошо это или нет. Выглядит вроде сносно
        // можно конечно интерфейс сделать, реализации разные (через полиморфизм)
        // но на мой взгляд это избыточно для этой задачи.
        // может я и не прав, и надо именно так и делать

        switch (dataType) {
            case "string":
                System.out.println("Введите строку:");
                String stringInput = scanner.nextLine();
                Message<String> stringMessage = new Message<>(stringInput);
                System.out.println(stringMessage);
                break;

            case "integer":
                System.out.println("Введите число:");
                int intInput = Integer.parseInt(scanner.nextLine());
                Message<Integer> intMessage = new Message<>(intInput);
                System.out.println(intMessage);
                break;

            default:
                System.out.println("Неверный тип данных. Пожалуйста, введите String или Integer.");
        }
    }
}
