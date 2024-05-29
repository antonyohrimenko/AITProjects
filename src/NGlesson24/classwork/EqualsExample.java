package NGlesson24.classwork;

import java.util.Scanner;

public class EqualsExample {
    public static void main(String[] args) {

        // защищенное приложение
        // спрашивает пароль и если пароль подойдет то пишет инфо

        System.out.println("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String correctPassword = "qwerty";


        if (password.equals(correctPassword)){
            System.out.println("Доступ разрешен");
        }
        else {
            System.out.println("Доступ запрещен");
        }
    }
}
