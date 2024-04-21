package lesson18.classwork;

public class MainCat {
    public static void main(String[] args) {

        Cat cat = new Cat(); // создаем обьект класса Cat
        // вызывается конструктор ()
        // физически создается ссылка в памяти
        // инициализация полей обьекта

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println(catName);

        // при создании обьекта класса все его поля инициализируются по умолчанию
        // для примитивных типов будут 0 или 0.0, для ссылочных или String null
        // для boolean false

        System.out.println("============");

        Cat cat1 = new Cat("Max");
        /*
        создан второй обьект класса Сat
        было передано имя в конструктор, в поле класса
         */


        System.out.println("Цвет " + cat1.color);
        System.out.println("Имя " + cat1.name);

        System.out.println("============");

        Cat cat2 = new Cat("Diamond", "readhead");
        cat2.whoAmI();

        System.out.println("============");

        Cat cat3 = new Cat ("Барсик", "Белый", 10);
        cat3.whoAmI();

    }
}
