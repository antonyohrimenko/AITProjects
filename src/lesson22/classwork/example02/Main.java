package lesson22.classwork.example02;

public class Main {

    public static void main(String[] args) {


        // Пример агрегации обьектов.


        Address address = new Address("Germany", "Berlin", "Weserstrasse. 48");

        Human human1 = new Human("Nico", address);
        Human human2 = new Human("Julie", address);

        human1.introduce();
        human2.introduce();
    }
}
