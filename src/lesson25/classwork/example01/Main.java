package lesson25.classwork.example01;

public class Main {
    public static void main(String[] args) {
        // тест полиморфизма

        Dog pet1 = new Dog("Sharik", 4);
        Cat pet2 = new Cat("Vasya", 3);


        pet1.voice();
        pet2.voice();

        System.out.println("\n ========= \n ");

        pet1.voice();
        pet1.cleanUp();
        pet1.feed();
        pet1.goForAWalk();

        System.out.println("\n ========= \n ");

        pet2.voice();
        pet2.feed();
        pet2.pet();
        pet2.cleanUp();

    }
}
