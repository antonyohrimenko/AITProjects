package lesson29.classwork.example01;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Box<Cat> box = new Box<>();
        // привязали Cat к Box (к текущему обьекту)

        Box<Dog> dogBox = new Box<>();

        Cat cat = new Cat();
        box.put(cat);
        System.out.println(box);

        Cat myCat = box.take();
        System.out.println(box);

        System.out.println(myCat.toString());


    }

}
