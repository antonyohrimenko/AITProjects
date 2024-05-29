package NGlesson24.classwork;

public class Main {

    // работа со строками

    public static void main(String[] args) {
        String s = "Привет мир!";
        String a = "Привет мир!";

        System.out.println(s.equals(a));


        s = s.toUpperCase();
        s = s.toLowerCase();

        s = s.replace("привет","Пока"); // регистр разный


        System.out.println(s.charAt(0));    // получить символ по индексу
        System.out.println(s.indexOf("П")); // получить индекс по символу

        System.out.println(s.length()); // получаем длину строки

        System.out.println("\n ======== \n");

        for (int i = 0; i < s.length(); i++){
            char symbol = s.charAt(i);
            System.out.println(symbol);
        }

        System.out.println(s);

        System.out.println("\n ======== \n");

        String a1 = "Bob";
        String a2 = "John";

        System.out.println(a1.compareTo(a2));

        String a3 = "Boriss";
        String a4 = "Boris";


        System.out.println(a4.contains("oris"));
        System.out.println(a3.contains(a4));

        System.out.println(" \n ========");

        System.out.println(a4.startsWith("B")); // начинается
        System.out.println(a4.endsWith("Z")); // заканчивается

        System.out.println(" \n ========");

        System.out.println(a4.substring(1, 2)); // c 1 по 2 не включительно b O ris
        System.out.println(a4.substring(1)); // c 1 и до конца

        String string1 = "   abc    ";
        System.out.println(string1.trim());






    }
}
