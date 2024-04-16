package lesson12.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] answer = new String[10];
        int[] listTime = new int[10];

        System.out.println("Введите список дел: ");
        String item;
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            item = scan.nextLine();
            if (item.equalsIgnoreCase("конец") || item.equalsIgnoreCase("end")) {
                break;
            }
            listTime[i] = scan.nextInt();
            scan.nextLine(); // поглотить знак /n
            answer[i] = item;
            count++;
        }

        int totalTime = 0;
        for (int i = 0; i < count; i++) {
            totalTime+= listTime[i];
        }
        System.out.println("Общее время равно: " + totalTime);
        // выводим значения
        // System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "." + answer[i] + " " + "(" + listTime[i] + " минут)");
        }

        // найти самое долгое время
        // алгоритм линейного поиска
        int maxIndex = 0;
        for (int i = 0; i < listTime.length; i++){
            if (listTime[maxIndex] < listTime[i]){
                maxIndex = i;
            }
        }
        System.out.println("Больше всего времени на " + answer[maxIndex] + " " + listTime[maxIndex] + " минут");
    }
}
