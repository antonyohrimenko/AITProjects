package lesson07.classwork;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        // A 100-90;  B 90-75; C 75-60; D 60-30 ; F 30-0

        System.out.println("Введите вашу оценку в баллах");
        String answer = "Ваша оценка соответствет букве ";

        int scan = new Scanner(System.in).nextInt();


        if (scan < 30){
            answer+= "F";
        }
        else if (scan < 60){
            answer+= "D";
        }
        else if (scan < 75){
            answer+= "C";
        }
        else if (scan < 90){
            answer+= "B";
        }
        else {
            answer+= "A";
        }

        // перевести оценку из буквенной в цифровую (пятибальную)
        // не использую switch или любой другой оператор. В одну строку
        System.out.println(answer);


        // получим индекс последнего символа строки, там будет буквенная наша оценка
        // (не знаю почему я сразу char не обьявил, а сделал  String)
        // Будем гемороиться так значит, так даже интереснее
        // Мы знаем что есть табличка ASCII где у каждого символа есть своя цифра
        // Наши буквы в цифренном выражении отличаются на единицу по таблице
        // значит можно найти разницу между нашей буквой и буквой "А".
        // Буква Е выбесила меня полностью :) Пришлось отойти, поспать и утром по новой думать

        System.out.println('F' - answer.charAt(answer.length() -1) == 0? 1 : 'F' - answer.charAt(answer.length() -1));

    }
}
