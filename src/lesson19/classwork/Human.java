package lesson19.classwork;

class Human {

    // создаем константы
    public static final String SPECIES = "Home sapience";


    private String name;
    private int age;

   private double mileage; // пробег в километрах / тест другой задачки
    boolean abc; // тест другой задачки

    public double getValue() {
        return mileage;
    }


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    инкапсуляция + геттеры и сеттеры (аксессоры).
    Геттеры - получают значение, сеттеры - задают значение поля
    Это методы паблик
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Задай корректный возраст!");
        }
    }


    public void sayHello() {
        System.out.println("I'm " + name + "! Age: " + age + ", Hello!");
    }

    public static void selebrateBirthday(Human human) {
        System.out.println(human.name + " Celebrating birthday");
        human.age++;
        System.out.println("He is now " + human.age + " y.o");
    }

    public static void meetFriends(Human h1, Human h2) {
        System.out.println(h1.name + " and " + h2.name + " see each other! Hello!");
        h1.sayHello();
        h2.sayHello();
    }


}
