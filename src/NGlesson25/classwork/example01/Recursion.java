package NGlesson25.classwork.example01;

public class Recursion {

    // рекурсия! что это?) Рекурсия это рекурсия

    public static void main(String[] args) {
        method(10); // будет выполнено пока стек не переполнится
    }


    // рекурсивный метод "плохой рекурсии". В нем нет ни базиса рекурсии ни шага
//    public static void method() {
//        System.out.println("Helllooooo");
//        method();
//    }



    // в рекурсивный метод добавили шаг (i-1)
//    public static void method(int i) {
//        System.out.println(i);
//        method(i - 1);
//    }

    // нужно вывести все числа от n до нуля. Добавим базис + шаг i -1

    public static void method(int i) {
        System.out.println(i);
        if (i == 0) {
            return;
        }
        method(i - 1);
    }

    // факториал 1! = 1   2! = 2  3! = 1*2*3


}
