package lesson24.classwork.example02;

public class Main {

    public static void voice(Pet pet){
        if (pet instanceof Cat){
            Cat cat = (Cat) pet;
            cat.meow();
        }
        if (pet instanceof  Dog){
            Dog dog = (Dog) pet;
            dog.bark();
        }
    }


    public static void main(String[] args) {

        Dog pet1 = new Dog("Richard", 6, "Golden retriever", 15, 50, DogProfession.DOMESTIC);
        Cat pet2 = new Cat("Vasya", 4, "Sphinks", 1.5, false);

        // восходящее и нисходящее преобразование
        // восходящее преобразование (от частного к общему)
        // записываем обьект дочернего класса в родительский

        voice(pet1);
        voice(pet2);



    }
}
