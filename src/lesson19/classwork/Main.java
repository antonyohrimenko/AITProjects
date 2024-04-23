package lesson19.classwork;

public class Main {
    public static void main(String[] args) {

       Human maxim = new Human("Maxim", 19);
       Human anton = new Human("Anton", 35);

        // anton.sayHello();
        maxim.sayHello();
        maxim.setAge(-10);

        maxim.sayHello();
        maxim.setAge(20);
        maxim.sayHello();

        Human.selebrateBirthday(maxim);
        System.out.println("===============================");

        Human.meetFriends(maxim, anton);

        System.out.println(Human.SPECIES);

        System.out.println("===============================");

        System.out.println(maxim.getValue());
        System.out.println(maxim.abc);












    }
}
