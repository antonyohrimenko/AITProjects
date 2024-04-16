package lesson12.classwork;

public class Main03 {

    // напечатать все числа от 1 до 50, которые не делятся 7 на цело

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++)
            if (i % 7 != 0){
                System.out.println(i);
            }
    }
}
