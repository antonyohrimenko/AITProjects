package lesson23.classwork.example01;


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Richard", 6, "Golden retriever", 15, 50, DogProfession.DOMESTIC);
        Cat cat = new Cat("Vasya", 4, "Sfinks", 1.5 ,false);

        dog.bark();
        cat.meow();

        Pet fish = new Pet("Katty", 1, "Gold fish", 0.2);

    }
}
