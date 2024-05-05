package lesson23.homework;

/*
В классе Человек должно быть поле "имя" и метод "представиться",
который будет выводить приветствие и имя человека.
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce (){
        System.out.println("Привет! Меня зовут " + name + ".");
    }
}

